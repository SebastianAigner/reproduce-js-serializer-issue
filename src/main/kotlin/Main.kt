import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

@Serializable
data class ShoppingListItem(val desc: String, val priority: Int) {
    val id: Int = desc.hashCode()
}

fun main() {
    val json = Json(JsonConfiguration.Stable)
    val str = json.stringify(ShoppingListItem.serializer(), ShoppingListItem("", 1))
    console.log(str)
}