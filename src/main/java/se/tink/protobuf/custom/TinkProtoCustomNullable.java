// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/customNullableFields.proto

package se.tink.protobuf.custom;

public final class TinkProtoCustomNullable {
  private TinkProtoCustomNullable() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_se_tink_CustomNullableObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_se_tink_CustomNullableObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_se_tink_ComplexValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_se_tink_ComplexValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_se_tink_NullableString_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_se_tink_NullableString_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_se_tink_NullableComplexValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_se_tink_NullableComplexValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-src/main/resources/customNullableField" +
      "s.proto\022\007se.tink\032\034google/protobuf/struct" +
      ".proto\"e\n\024CustomNullableObject\022\n\n\002id\030\001 \001" +
      "(\003\022\014\n\004name\030\002 \001(\t\0223\n\014complexValue\030\003 \001(\0132\035" +
      ".se.tink.NullableComplexValue\"*\n\014Complex" +
      "Value\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\"T\n\016Nul" +
      "lableString\022*\n\004null\030\001 \001(\0162\032.google.proto" +
      "buf.NullValueH\000\022\016\n\004data\030\002 \001(\tH\000B\006\n\004kind\"" +
      "y\n\024NullableComplexValue\022*\n\004null\030\001 \001(\0162\032." +
      "google.protobuf.NullValueH\000\022-\n\014complexVa" +
      "lue\030\002 \001(\0132\025.se.tink.ComplexValueH\000B\006\n\004ki" +
      "ndB4\n\027se.tink.protobuf.customB\027TinkProto" +
      "CustomNullableP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_se_tink_CustomNullableObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_se_tink_CustomNullableObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_se_tink_CustomNullableObject_descriptor,
        new java.lang.String[] { "Id", "Name", "ComplexValue", });
    internal_static_se_tink_ComplexValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_se_tink_ComplexValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_se_tink_ComplexValue_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_se_tink_NullableString_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_se_tink_NullableString_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_se_tink_NullableString_descriptor,
        new java.lang.String[] { "Null", "Data", "Kind", });
    internal_static_se_tink_NullableComplexValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_se_tink_NullableComplexValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_se_tink_NullableComplexValue_descriptor,
        new java.lang.String[] { "Null", "ComplexValue", "Kind", });
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}