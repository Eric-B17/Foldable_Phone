class Phone(var isScreenLightOn: Boolean = false) {
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isScreenFolded: Boolean = false) {
    fun switchOn() {
        isScreenFolded = false
    }

    fun switchOff() {
        isScreenFolded = true
    }

    fun checkPhoneScreenLight() {
        val phoneScreen = if (isScreenFolded) "on because its not folded" else "off because it is folded"
        println("The phone screen is $phoneScreen.")
    }
}


fun main() {
    val phone = FoldablePhone()
    phone.checkPhoneScreenLight()
}
///