// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetAuthkeyReq.proto

package emu.grasscutter.net.proto;

public final class GetAuthkeyReqOuterClass {
  private GetAuthkeyReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetAuthkeyReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetAuthkeyReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 PGANJHDNINM = 7;</code>
     * @return The pGANJHDNINM.
     */
    int getPGANJHDNINM();

    /**
     * <code>string auth_appid = 2;</code>
     * @return The authAppid.
     */
    java.lang.String getAuthAppid();
    /**
     * <code>string auth_appid = 2;</code>
     * @return The bytes for authAppid.
     */
    com.google.protobuf.ByteString
        getAuthAppidBytes();

    /**
     * <code>uint32 BIGHJAIBJJK = 14;</code>
     * @return The bIGHJAIBJJK.
     */
    int getBIGHJAIBJJK();
  }
  /**
   * <pre>
   * CmdId: 27875
   * Obf: DCPMJKGKCGE
   * </pre>
   *
   * Protobuf type {@code GetAuthkeyReq}
   */
  public static final class GetAuthkeyReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetAuthkeyReq)
      GetAuthkeyReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetAuthkeyReq.newBuilder() to construct.
    private GetAuthkeyReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetAuthkeyReq() {
      authAppid_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetAuthkeyReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetAuthkeyReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              authAppid_ = s;
              break;
            }
            case 56: {

              pGANJHDNINM_ = input.readUInt32();
              break;
            }
            case 112: {

              bIGHJAIBJJK_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq.class, emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq.Builder.class);
    }

    public static final int PGANJHDNINM_FIELD_NUMBER = 7;
    private int pGANJHDNINM_;
    /**
     * <code>uint32 PGANJHDNINM = 7;</code>
     * @return The pGANJHDNINM.
     */
    @java.lang.Override
    public int getPGANJHDNINM() {
      return pGANJHDNINM_;
    }

    public static final int AUTH_APPID_FIELD_NUMBER = 2;
    private volatile java.lang.Object authAppid_;
    /**
     * <code>string auth_appid = 2;</code>
     * @return The authAppid.
     */
    @java.lang.Override
    public java.lang.String getAuthAppid() {
      java.lang.Object ref = authAppid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authAppid_ = s;
        return s;
      }
    }
    /**
     * <code>string auth_appid = 2;</code>
     * @return The bytes for authAppid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthAppidBytes() {
      java.lang.Object ref = authAppid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authAppid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BIGHJAIBJJK_FIELD_NUMBER = 14;
    private int bIGHJAIBJJK_;
    /**
     * <code>uint32 BIGHJAIBJJK = 14;</code>
     * @return The bIGHJAIBJJK.
     */
    @java.lang.Override
    public int getBIGHJAIBJJK() {
      return bIGHJAIBJJK_;
    }

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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authAppid_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, authAppid_);
      }
      if (pGANJHDNINM_ != 0) {
        output.writeUInt32(7, pGANJHDNINM_);
      }
      if (bIGHJAIBJJK_ != 0) {
        output.writeUInt32(14, bIGHJAIBJJK_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(authAppid_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, authAppid_);
      }
      if (pGANJHDNINM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, pGANJHDNINM_);
      }
      if (bIGHJAIBJJK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, bIGHJAIBJJK_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq other = (emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq) obj;

      if (getPGANJHDNINM()
          != other.getPGANJHDNINM()) return false;
      if (!getAuthAppid()
          .equals(other.getAuthAppid())) return false;
      if (getBIGHJAIBJJK()
          != other.getBIGHJAIBJJK()) return false;
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
      hash = (37 * hash) + PGANJHDNINM_FIELD_NUMBER;
      hash = (53 * hash) + getPGANJHDNINM();
      hash = (37 * hash) + AUTH_APPID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthAppid().hashCode();
      hash = (37 * hash) + BIGHJAIBJJK_FIELD_NUMBER;
      hash = (53 * hash) + getBIGHJAIBJJK();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq prototype) {
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
     * <pre>
     * CmdId: 27875
     * Obf: DCPMJKGKCGE
     * </pre>
     *
     * Protobuf type {@code GetAuthkeyReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetAuthkeyReq)
        emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq.class, emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq.newBuilder()
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
        pGANJHDNINM_ = 0;

        authAppid_ = "";

        bIGHJAIBJJK_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.internal_static_GetAuthkeyReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq build() {
        emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq buildPartial() {
        emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq result = new emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq(this);
        result.pGANJHDNINM_ = pGANJHDNINM_;
        result.authAppid_ = authAppid_;
        result.bIGHJAIBJJK_ = bIGHJAIBJJK_;
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
        if (other instanceof emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq other) {
        if (other == emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq.getDefaultInstance()) return this;
        if (other.getPGANJHDNINM() != 0) {
          setPGANJHDNINM(other.getPGANJHDNINM());
        }
        if (!other.getAuthAppid().isEmpty()) {
          authAppid_ = other.authAppid_;
          onChanged();
        }
        if (other.getBIGHJAIBJJK() != 0) {
          setBIGHJAIBJJK(other.getBIGHJAIBJJK());
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
        emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pGANJHDNINM_ ;
      /**
       * <code>uint32 PGANJHDNINM = 7;</code>
       * @return The pGANJHDNINM.
       */
      @java.lang.Override
      public int getPGANJHDNINM() {
        return pGANJHDNINM_;
      }
      /**
       * <code>uint32 PGANJHDNINM = 7;</code>
       * @param value The pGANJHDNINM to set.
       * @return This builder for chaining.
       */
      public Builder setPGANJHDNINM(int value) {
        
        pGANJHDNINM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PGANJHDNINM = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearPGANJHDNINM() {
        
        pGANJHDNINM_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object authAppid_ = "";
      /**
       * <code>string auth_appid = 2;</code>
       * @return The authAppid.
       */
      public java.lang.String getAuthAppid() {
        java.lang.Object ref = authAppid_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          authAppid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string auth_appid = 2;</code>
       * @return The bytes for authAppid.
       */
      public com.google.protobuf.ByteString
          getAuthAppidBytes() {
        java.lang.Object ref = authAppid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          authAppid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string auth_appid = 2;</code>
       * @param value The authAppid to set.
       * @return This builder for chaining.
       */
      public Builder setAuthAppid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        authAppid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string auth_appid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthAppid() {
        
        authAppid_ = getDefaultInstance().getAuthAppid();
        onChanged();
        return this;
      }
      /**
       * <code>string auth_appid = 2;</code>
       * @param value The bytes for authAppid to set.
       * @return This builder for chaining.
       */
      public Builder setAuthAppidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        authAppid_ = value;
        onChanged();
        return this;
      }

      private int bIGHJAIBJJK_ ;
      /**
       * <code>uint32 BIGHJAIBJJK = 14;</code>
       * @return The bIGHJAIBJJK.
       */
      @java.lang.Override
      public int getBIGHJAIBJJK() {
        return bIGHJAIBJJK_;
      }
      /**
       * <code>uint32 BIGHJAIBJJK = 14;</code>
       * @param value The bIGHJAIBJJK to set.
       * @return This builder for chaining.
       */
      public Builder setBIGHJAIBJJK(int value) {
        
        bIGHJAIBJJK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BIGHJAIBJJK = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBIGHJAIBJJK() {
        
        bIGHJAIBJJK_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetAuthkeyReq)
    }

    // @@protoc_insertion_point(class_scope:GetAuthkeyReq)
    private static final emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq();
    }

    public static emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetAuthkeyReq>
        PARSER = new com.google.protobuf.AbstractParser<GetAuthkeyReq>() {
      @java.lang.Override
      public GetAuthkeyReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetAuthkeyReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetAuthkeyReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetAuthkeyReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetAuthkeyReqOuterClass.GetAuthkeyReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAuthkeyReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAuthkeyReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023GetAuthkeyReq.proto\"M\n\rGetAuthkeyReq\022\023" +
      "\n\013PGANJHDNINM\030\007 \001(\r\022\022\n\nauth_appid\030\002 \001(\t\022" +
      "\023\n\013BIGHJAIBJJK\030\016 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetAuthkeyReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAuthkeyReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAuthkeyReq_descriptor,
        new java.lang.String[] { "PGANJHDNINM", "AuthAppid", "BIGHJAIBJJK", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
