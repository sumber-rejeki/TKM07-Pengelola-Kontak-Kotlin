//by erdiansyah
class ContactManager {
    private val contacts: MutableList<Contact> = mutableListOf()

    fun addContact(contact: Contact) {
        contacts.add(contact)
    }

    fun removeContact(contact: Contact) {
        contacts.remove(contact)
    }

    fun displayContacts() {
        println("List of Contacts:")
        contacts.forEachIndexed { index, contact ->
            println("${index + 1}. ${contact.getName()} - ${contact.getPhoneNumber()} - ${contact.getEmail()}")
        }
    }
}
