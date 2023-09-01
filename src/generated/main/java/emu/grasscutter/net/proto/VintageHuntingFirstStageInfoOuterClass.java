// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VintageHuntingFirstStageInfo.proto

package emu.grasscutter.net.proto;

public final class VintageHuntingFirstStageInfoOuterClass {
  private VintageHuntingFirstStageInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VintageHuntingFirstStageInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VintageHuntingFirstStageInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 2;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 FOFOBNPOLNO = 11;</code>
     * @return The fOFOBNPOLNO.
     */
    int getFOFOBNPOLNO();

    /**
     * <code>uint32 GKNLFDOFFCN = 6;</code>
     * @return The gKNLFDOFFCN.
     */
    int getGKNLFDOFFCN();

    /**
     * <code>uint32 FHPLLANPPMO = 12;</code>
     * @return The fHPLLANPPMO.
     */
    int getFHPLLANPPMO();
  }
  /**
   * <pre>
   * Obf: LGOMHHBJHFE
   * </pre>
   *
   * Protobuf type {@code VintageHuntingFirstStageInfo}
   */
  public static final class VintageHuntingFirstStageInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VintageHuntingFirstStageInfo)
      VintageHuntingFirstStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VintageHuntingFirstStageInfo.newBuilder() to construct.
    private VintageHuntingFirstStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VintageHuntingFirstStageInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VintageHuntingFirstStageInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VintageHuntingFirstStageInfo(
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
            case 16: {

              score_ = input.readUInt32();
              break;
            }
            case 48: {

              gKNLFDOFFCN_ = input.readUInt32();
              break;
            }
            case 88: {

              fOFOBNPOLNO_ = input.readUInt32();
              break;
            }
            case 96: {

              fHPLLANPPMO_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.class, emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 2;
    private int score_;
    /**
     * <code>uint32 score = 2;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int FOFOBNPOLNO_FIELD_NUMBER = 11;
    private int fOFOBNPOLNO_;
    /**
     * <code>uint32 FOFOBNPOLNO = 11;</code>
     * @return The fOFOBNPOLNO.
     */
    @java.lang.Override
    public int getFOFOBNPOLNO() {
      return fOFOBNPOLNO_;
    }

    public static final int GKNLFDOFFCN_FIELD_NUMBER = 6;
    private int gKNLFDOFFCN_;
    /**
     * <code>uint32 GKNLFDOFFCN = 6;</code>
     * @return The gKNLFDOFFCN.
     */
    @java.lang.Override
    public int getGKNLFDOFFCN() {
      return gKNLFDOFFCN_;
    }

    public static final int FHPLLANPPMO_FIELD_NUMBER = 12;
    private int fHPLLANPPMO_;
    /**
     * <code>uint32 FHPLLANPPMO = 12;</code>
     * @return The fHPLLANPPMO.
     */
    @java.lang.Override
    public int getFHPLLANPPMO() {
      return fHPLLANPPMO_;
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
      if (score_ != 0) {
        output.writeUInt32(2, score_);
      }
      if (gKNLFDOFFCN_ != 0) {
        output.writeUInt32(6, gKNLFDOFFCN_);
      }
      if (fOFOBNPOLNO_ != 0) {
        output.writeUInt32(11, fOFOBNPOLNO_);
      }
      if (fHPLLANPPMO_ != 0) {
        output.writeUInt32(12, fHPLLANPPMO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, score_);
      }
      if (gKNLFDOFFCN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gKNLFDOFFCN_);
      }
      if (fOFOBNPOLNO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, fOFOBNPOLNO_);
      }
      if (fHPLLANPPMO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, fHPLLANPPMO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo other = (emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getFOFOBNPOLNO()
          != other.getFOFOBNPOLNO()) return false;
      if (getGKNLFDOFFCN()
          != other.getGKNLFDOFFCN()) return false;
      if (getFHPLLANPPMO()
          != other.getFHPLLANPPMO()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + FOFOBNPOLNO_FIELD_NUMBER;
      hash = (53 * hash) + getFOFOBNPOLNO();
      hash = (37 * hash) + GKNLFDOFFCN_FIELD_NUMBER;
      hash = (53 * hash) + getGKNLFDOFFCN();
      hash = (37 * hash) + FHPLLANPPMO_FIELD_NUMBER;
      hash = (53 * hash) + getFHPLLANPPMO();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo prototype) {
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
     * Obf: LGOMHHBJHFE
     * </pre>
     *
     * Protobuf type {@code VintageHuntingFirstStageInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VintageHuntingFirstStageInfo)
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.class, emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.newBuilder()
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
        score_ = 0;

        fOFOBNPOLNO_ = 0;

        gKNLFDOFFCN_ = 0;

        fHPLLANPPMO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.internal_static_VintageHuntingFirstStageInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo build() {
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo buildPartial() {
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo result = new emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo(this);
        result.score_ = score_;
        result.fOFOBNPOLNO_ = fOFOBNPOLNO_;
        result.gKNLFDOFFCN_ = gKNLFDOFFCN_;
        result.fHPLLANPPMO_ = fHPLLANPPMO_;
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
        if (other instanceof emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo) {
          return mergeFrom((emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo other) {
        if (other == emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getFOFOBNPOLNO() != 0) {
          setFOFOBNPOLNO(other.getFOFOBNPOLNO());
        }
        if (other.getGKNLFDOFFCN() != 0) {
          setGKNLFDOFFCN(other.getGKNLFDOFFCN());
        }
        if (other.getFHPLLANPPMO() != 0) {
          setFHPLLANPPMO(other.getFHPLLANPPMO());
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
        emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 2;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 2;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int fOFOBNPOLNO_ ;
      /**
       * <code>uint32 FOFOBNPOLNO = 11;</code>
       * @return The fOFOBNPOLNO.
       */
      @java.lang.Override
      public int getFOFOBNPOLNO() {
        return fOFOBNPOLNO_;
      }
      /**
       * <code>uint32 FOFOBNPOLNO = 11;</code>
       * @param value The fOFOBNPOLNO to set.
       * @return This builder for chaining.
       */
      public Builder setFOFOBNPOLNO(int value) {
        
        fOFOBNPOLNO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FOFOBNPOLNO = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFOFOBNPOLNO() {
        
        fOFOBNPOLNO_ = 0;
        onChanged();
        return this;
      }

      private int gKNLFDOFFCN_ ;
      /**
       * <code>uint32 GKNLFDOFFCN = 6;</code>
       * @return The gKNLFDOFFCN.
       */
      @java.lang.Override
      public int getGKNLFDOFFCN() {
        return gKNLFDOFFCN_;
      }
      /**
       * <code>uint32 GKNLFDOFFCN = 6;</code>
       * @param value The gKNLFDOFFCN to set.
       * @return This builder for chaining.
       */
      public Builder setGKNLFDOFFCN(int value) {
        
        gKNLFDOFFCN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GKNLFDOFFCN = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGKNLFDOFFCN() {
        
        gKNLFDOFFCN_ = 0;
        onChanged();
        return this;
      }

      private int fHPLLANPPMO_ ;
      /**
       * <code>uint32 FHPLLANPPMO = 12;</code>
       * @return The fHPLLANPPMO.
       */
      @java.lang.Override
      public int getFHPLLANPPMO() {
        return fHPLLANPPMO_;
      }
      /**
       * <code>uint32 FHPLLANPPMO = 12;</code>
       * @param value The fHPLLANPPMO to set.
       * @return This builder for chaining.
       */
      public Builder setFHPLLANPPMO(int value) {
        
        fHPLLANPPMO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FHPLLANPPMO = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearFHPLLANPPMO() {
        
        fHPLLANPPMO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:VintageHuntingFirstStageInfo)
    }

    // @@protoc_insertion_point(class_scope:VintageHuntingFirstStageInfo)
    private static final emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo();
    }

    public static emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VintageHuntingFirstStageInfo>
        PARSER = new com.google.protobuf.AbstractParser<VintageHuntingFirstStageInfo>() {
      @java.lang.Override
      public VintageHuntingFirstStageInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VintageHuntingFirstStageInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VintageHuntingFirstStageInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VintageHuntingFirstStageInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VintageHuntingFirstStageInfoOuterClass.VintageHuntingFirstStageInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VintageHuntingFirstStageInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"VintageHuntingFirstStageInfo.proto\"l\n\034" +
      "VintageHuntingFirstStageInfo\022\r\n\005score\030\002 " +
      "\001(\r\022\023\n\013FOFOBNPOLNO\030\013 \001(\r\022\023\n\013GKNLFDOFFCN\030" +
      "\006 \001(\r\022\023\n\013FHPLLANPPMO\030\014 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_VintageHuntingFirstStageInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VintageHuntingFirstStageInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VintageHuntingFirstStageInfo_descriptor,
        new java.lang.String[] { "Score", "FOFOBNPOLNO", "GKNLFDOFFCN", "FHPLLANPPMO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
