class Color {
  fun printRed(text: String) {
    print("\u001B[31m$text")
    printReset()
  }

  fun printBlack(text: String) {
    print("\u001B[30m$text")
    printReset()
  }

  fun printGreen(text: String) {
    print("\u001B[32m$text")
    printReset()
  }

  fun printYellow(text: String) {
    print("\u001B[33m$text")
    printReset()
  }

  fun printBlue(text: String) {
    print("\u001B[34m$text")
    printReset()

  }

  fun printPurple(text: String) {
    print("\u001B[35m$text")
    printReset()
  }

  fun printCyan(text: String) {
    print("\u001B[36m$text")
  }

  fun printWhite(text: String) {
    print("\u001B[37m$text")
  }

  fun printReset() {
    //Resets back to the terminals defualt color.
    print("\u001B[0m")
    print("")
  }
}
