package org.myas.protobuf;

public class Main {
    public static void main(String[] args) {
        AddressBookProtos.Person john =
                AddressBookProtos.Person.newBuilder()
                        .setId(1234)
                        .setName("John Doe")
                        .setEmail("jdoe@example.com")
                        .addPhones(
                                AddressBookProtos.Person.PhoneNumber.newBuilder()
                                        .setNumber("555-4321")
                                        .setType(AddressBookProtos.Person.PhoneType.HOME))
                        .build();

        AddressBookProtos.AddressBook book =
                AddressBookProtos.AddressBook.newBuilder()
                        .addPeople(john)
                        .addPeople(john)
                        .build();

        System.out.println(book.getPeopleCount());
        System.out.println(book.isInitialized());

        System.out.println(john.toString());
        System.out.println(book.toString());
    }
}
