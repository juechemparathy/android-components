[android-components](../../index.md) / [mozilla.components.support.ktx.android.org.json](../index.md) / [org.json.JSONObject](./index.md)

### Extensions for org.json.JSONObject

| Name | Summary |
|---|---|
| [mergeWith](merge-with.md) | `fun `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`.mergeWith(other: `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Merge the contents of another [JSONObject](https://developer.android.com/reference/org/json/JSONObject.html) with this object, overwriting the colliding keys. |
| [putIfNotNull](put-if-not-null.md) | `fun `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`.putIfNotNull(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Puts the specified value under the key if it's not null |
| [sortKeys](sort-keys.md) | `fun `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`.sortKeys(): `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)<br>Sorts the keys of a JSONObject (and all of its child JSONObjects) alphabetically |
| [tryGetInt](try-get-int.md) | `fun `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`.tryGetInt(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?`<br>Returns the value mapped by {@code key} if it exists, and if the value returned is not null. If it's null, it returns null |
| [tryGetLong](try-get-long.md) | `fun `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`.tryGetLong(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?`<br>Returns the value mapped by {@code key} if it exists, and if the value returned is not null. If it's null, it returns null |
| [tryGetString](try-get-string.md) | `fun `[`JSONObject`](https://developer.android.com/reference/org/json/JSONObject.html)`.tryGetString(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?`<br>Returns the value mapped by {@code key} if it exists, and if the value returned is not null. If it's null, it returns null |