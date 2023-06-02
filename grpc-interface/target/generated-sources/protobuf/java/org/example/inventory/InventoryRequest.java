// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package org.example.inventory;

/**
 * Protobuf type {@code org.example.inventory.InventoryRequest}
 */
public final class InventoryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.inventory.InventoryRequest)
    InventoryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryRequest.newBuilder() to construct.
  private InventoryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryRequest() {
    productId_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventoryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              productId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            productId_.addLong(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              productId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              productId_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        productId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.inventory.Inventory.internal_static_org_example_inventory_InventoryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.inventory.Inventory.internal_static_org_example_inventory_InventoryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.inventory.InventoryRequest.class, org.example.inventory.InventoryRequest.Builder.class);
  }

  public static final int PRODUCT_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.LongList productId_;
  /**
   * <code>repeated int64 product_id = 1;</code>
   * @return A list containing the productId.
   */
  @java.lang.Override
  public java.util.List<java.lang.Long>
      getProductIdList() {
    return productId_;
  }
  /**
   * <code>repeated int64 product_id = 1;</code>
   * @return The count of productId.
   */
  public int getProductIdCount() {
    return productId_.size();
  }
  /**
   * <code>repeated int64 product_id = 1;</code>
   * @param index The index of the element to return.
   * @return The productId at the given index.
   */
  public long getProductId(int index) {
    return productId_.getLong(index);
  }
  private int productIdMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getProductIdList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(productIdMemoizedSerializedSize);
    }
    for (int i = 0; i < productId_.size(); i++) {
      output.writeInt64NoTag(productId_.getLong(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < productId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(productId_.getLong(i));
      }
      size += dataSize;
      if (!getProductIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      productIdMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.inventory.InventoryRequest)) {
      return super.equals(obj);
    }
    org.example.inventory.InventoryRequest other = (org.example.inventory.InventoryRequest) obj;

    if (!getProductIdList()
        .equals(other.getProductIdList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getProductIdCount() > 0) {
      hash = (37 * hash) + PRODUCT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getProductIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.inventory.InventoryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.inventory.InventoryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.inventory.InventoryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.inventory.InventoryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.inventory.InventoryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.inventory.InventoryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.inventory.InventoryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.inventory.InventoryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.inventory.InventoryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.inventory.InventoryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.inventory.InventoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.inventory.InventoryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.inventory.InventoryRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.example.inventory.InventoryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.inventory.InventoryRequest)
      org.example.inventory.InventoryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.inventory.Inventory.internal_static_org_example_inventory_InventoryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.inventory.Inventory.internal_static_org_example_inventory_InventoryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.inventory.InventoryRequest.class, org.example.inventory.InventoryRequest.Builder.class);
    }

    // Construct using org.example.inventory.InventoryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      productId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.inventory.Inventory.internal_static_org_example_inventory_InventoryRequest_descriptor;
    }

    @java.lang.Override
    public org.example.inventory.InventoryRequest getDefaultInstanceForType() {
      return org.example.inventory.InventoryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.inventory.InventoryRequest build() {
      org.example.inventory.InventoryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.inventory.InventoryRequest buildPartial() {
      org.example.inventory.InventoryRequest result = new org.example.inventory.InventoryRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        productId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.productId_ = productId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.inventory.InventoryRequest) {
        return mergeFrom((org.example.inventory.InventoryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.inventory.InventoryRequest other) {
      if (other == org.example.inventory.InventoryRequest.getDefaultInstance()) return this;
      if (!other.productId_.isEmpty()) {
        if (productId_.isEmpty()) {
          productId_ = other.productId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureProductIdIsMutable();
          productId_.addAll(other.productId_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.example.inventory.InventoryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.inventory.InventoryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.LongList productId_ = emptyLongList();
    private void ensureProductIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        productId_ = mutableCopy(productId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 product_id = 1;</code>
     * @return A list containing the productId.
     */
    public java.util.List<java.lang.Long>
        getProductIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(productId_) : productId_;
    }
    /**
     * <code>repeated int64 product_id = 1;</code>
     * @return The count of productId.
     */
    public int getProductIdCount() {
      return productId_.size();
    }
    /**
     * <code>repeated int64 product_id = 1;</code>
     * @param index The index of the element to return.
     * @return The productId at the given index.
     */
    public long getProductId(int index) {
      return productId_.getLong(index);
    }
    /**
     * <code>repeated int64 product_id = 1;</code>
     * @param index The index to set the value at.
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(
        int index, long value) {
      ensureProductIdIsMutable();
      productId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 product_id = 1;</code>
     * @param value The productId to add.
     * @return This builder for chaining.
     */
    public Builder addProductId(long value) {
      ensureProductIdIsMutable();
      productId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 product_id = 1;</code>
     * @param values The productId to add.
     * @return This builder for chaining.
     */
    public Builder addAllProductId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureProductIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, productId_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 product_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      productId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.example.inventory.InventoryRequest)
  }

  // @@protoc_insertion_point(class_scope:org.example.inventory.InventoryRequest)
  private static final org.example.inventory.InventoryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.inventory.InventoryRequest();
  }

  public static org.example.inventory.InventoryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryRequest>
      PARSER = new com.google.protobuf.AbstractParser<InventoryRequest>() {
    @java.lang.Override
    public InventoryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.inventory.InventoryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
