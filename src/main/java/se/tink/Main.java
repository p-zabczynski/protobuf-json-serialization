package se.tink;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import se.tink.protobuf.default_behaviour.TinkProtoDefault.DefaultComplexValue;
import se.tink.protobuf.default_behaviour.TinkProtoDefault.DefaultObject;

public class Main {

  public static void main(String[] args) throws InvalidProtocolBufferException {
    final var jsonParserSkipDefaultFields = JsonFormat.printer();
    final var jsonParserIncludeDefaultValues = JsonFormat.printer().includingDefaultValueFields();


    final var defaultObject = DefaultObject.newBuilder().build();

    final var defaultObjectWithEmptySubObject = DefaultObject.newBuilder()
        .setName("defaultObjectWithEmptySubObject name")
        .setComplexValue(DefaultComplexValue.newBuilder().build())
        .build();
    final var defaultObjectWithNonEmptySubObject = DefaultObject.newBuilder()
        .setId(100)
        .setName("defaultObjectWithNonEmptySubObject name")
        .setComplexValue(DefaultComplexValue.newBuilder().setName("DefaultComplexValue name").setType("some type").build())
        .build();

    System.out.println("############ skip not set fields ############");
    System.out.println("defaultObject:\n" + jsonParserSkipDefaultFields.print(defaultObject) + "\n");
    System.out.println("defaultObjectWithEmptySubObject:\n" + jsonParserSkipDefaultFields.print(defaultObjectWithEmptySubObject) + "\n");
    System.out.println("defaultObjectWithNonEmptySubObject\n" + jsonParserSkipDefaultFields.print(defaultObjectWithNonEmptySubObject) + "\n");
    System.out.print("\n\n");
    System.out.println("############ include not set fields ############");
    System.out.print("\n\n");
    System.out.println("defaultObject: \n" + jsonParserIncludeDefaultValues.print(defaultObject) + "\n");
    System.out.println("defaultObjectWithEmptySubObject:\n" + jsonParserIncludeDefaultValues.print(defaultObjectWithEmptySubObject) + "\n");
    System.out.println("defaultObjectWithNonEmptySubObject: \n" + jsonParserIncludeDefaultValues.print(defaultObjectWithNonEmptySubObject) + "\n");
  }
}
