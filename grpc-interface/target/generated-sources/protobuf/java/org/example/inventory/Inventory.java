// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package org.example.inventory;

public final class Inventory {
  private Inventory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_inventory_InventoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_inventory_InventoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_inventory_InventoryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_inventory_InventoryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017inventory.proto\022\025org.example.inventory" +
      "\"&\n\020InventoryRequest\022\022\n\nproduct_id\030\001 \003(\003" +
      "\"\'\n\021InventoryResponse\022\022\n\nallInStock\030\001 \001(" +
      "\0102r\n\020InventoryService\022^\n\tinventory\022\'.org" +
      ".example.inventory.InventoryRequest\032(.or" +
      "g.example.inventory.InventoryResponseB\002P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_inventory_InventoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_inventory_InventoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_inventory_InventoryRequest_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_org_example_inventory_InventoryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_inventory_InventoryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_inventory_InventoryResponse_descriptor,
        new java.lang.String[] { "AllInStock", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
