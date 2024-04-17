fun main() {
    val contact1 = Contact("John Doe", "1234567890", "john@example.com")
    val contact2 = Contact("Jane Smith", "0987654321", "jane@example.com")

    val contactManager = ContactManager()
    contactManager.addContact(contact1)
    contactManager.addContact(contact2)

    // Display contacts
    contactManager.displayContacts()

    // Example of using extension function
    contact1.printFormatted()
}
