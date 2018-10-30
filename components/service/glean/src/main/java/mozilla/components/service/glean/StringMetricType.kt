/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package mozilla.components.service.glean

import mozilla.components.service.glean.storages.StringsStorageEngine
import mozilla.components.support.base.log.logger.Logger

// Maximum length of any passed value string, in UTF8 byte sequence length.
internal const val MAX_LENGTH_STRING_VALUE = 50

/**
 * This implements the developer facing API for recording string metrics.
 *
 * Instances of this class type are automatically generated by the parsers at build time,
 * allowing developers to record values that were previously registered in the metrics.yaml file.
 *
 * The string API only exposes the [set] method, which takes care of validating the input
 * data and making sure that limits are enforced.
 */
data class StringMetricType(
    override val applicationProperty: Boolean,
    override val disabled: Boolean,
    override val category: String,
    override val name: String,
    override val sendInPings: List<String>,
    override val userProperty: Boolean
) : CommonMetricData {
    private val logger = Logger("glean/StringMetricType")

    /**
     * Set a string value.
     *
     * @param value This is a user defined string value. The maximum length of
     * this string is defined the metrics.yaml file by max_length.
     */
    public fun set(value: String) {
        // TODO report errors through other special metrics handled by the SDK. See bug 1499761.

        if (!shouldRecord(logger)) {
            return
        }

        val truncatedValue = value.let {
            if (it.length > MAX_LENGTH_STRING_VALUE) {
                logger.warn("String length ${it.length} > $MAX_LENGTH_STRING_VALUE")
                return@let it.substring(0, MAX_LENGTH_STRING_VALUE)
            }
            it
        }

        // Delegate storing the string to the storage engine.
        StringsStorageEngine.record(
            stores = sendInPings,
            category = category,
            name = name,
            value = truncatedValue
        )
    }
}