// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoSaveTeamReq.proto

package emu.grasscutter.net.proto;

public final class SumoSaveTeamReqOuterClass {
  private SumoSaveTeamReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoSaveTeamReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoSaveTeamReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 activity_id = 12;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData> 
        getTeamListList();
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData getTeamList(int index);
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    int getTeamListCount();
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
        getTeamListOrBuilderList();
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder getTeamListOrBuilder(
        int index);

    /**
     * <code>uint32 stage_id = 10;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 difficulty_id = 8;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   * CmdId: 26768
   * Obf: MDGBNHHAJFP
   * </pre>
   *
   * Protobuf type {@code SumoSaveTeamReq}
   */
  public static final class SumoSaveTeamReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoSaveTeamReq)
      SumoSaveTeamReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoSaveTeamReq.newBuilder() to construct.
    private SumoSaveTeamReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoSaveTeamReq() {
      teamList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoSaveTeamReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SumoSaveTeamReq(
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
            case 64: {

              difficultyId_ = input.readUInt32();
              break;
            }
            case 80: {

              stageId_ = input.readUInt32();
              break;
            }
            case 96: {

              activityId_ = input.readUInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                teamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData>();
                mutable_bitField0_ |= 0x00000001;
              }
              teamList_.add(
                  input.readMessage(emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.parser(), extensionRegistry));
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
          teamList_ = java.util.Collections.unmodifiableList(teamList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.class, emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.Builder.class);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 12;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 12;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int TEAM_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData> teamList_;
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData> getTeamListList() {
      return teamList_;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
        getTeamListOrBuilderList() {
      return teamList_;
    }
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    @java.lang.Override
    public int getTeamListCount() {
      return teamList_.size();
    }
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData getTeamList(int index) {
      return teamList_.get(index);
    }
    /**
     * <code>repeated .SumoTeamData team_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder getTeamListOrBuilder(
        int index) {
      return teamList_.get(index);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 10;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 10;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 8;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 8;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
      if (difficultyId_ != 0) {
        output.writeUInt32(8, difficultyId_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(10, stageId_);
      }
      if (activityId_ != 0) {
        output.writeUInt32(12, activityId_);
      }
      for (int i = 0; i < teamList_.size(); i++) {
        output.writeMessage(14, teamList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, difficultyId_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, stageId_);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, activityId_);
      }
      for (int i = 0; i < teamList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, teamList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq other = (emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq) obj;

      if (getActivityId()
          != other.getActivityId()) return false;
      if (!getTeamListList()
          .equals(other.getTeamListList())) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
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
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      if (getTeamListCount() > 0) {
        hash = (37 * hash) + TEAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTeamListList().hashCode();
      }
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq prototype) {
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
     * CmdId: 26768
     * Obf: MDGBNHHAJFP
     * </pre>
     *
     * Protobuf type {@code SumoSaveTeamReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoSaveTeamReq)
        emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.class, emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.newBuilder()
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
          getTeamListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        activityId_ = 0;

        if (teamListBuilder_ == null) {
          teamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          teamListBuilder_.clear();
        }
        stageId_ = 0;

        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.internal_static_SumoSaveTeamReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq build() {
        emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq buildPartial() {
        emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq result = new emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq(this);
        int from_bitField0_ = bitField0_;
        result.activityId_ = activityId_;
        if (teamListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            teamList_ = java.util.Collections.unmodifiableList(teamList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.teamList_ = teamList_;
        } else {
          result.teamList_ = teamListBuilder_.build();
        }
        result.stageId_ = stageId_;
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq) {
          return mergeFrom((emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq other) {
        if (other == emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq.getDefaultInstance()) return this;
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (teamListBuilder_ == null) {
          if (!other.teamList_.isEmpty()) {
            if (teamList_.isEmpty()) {
              teamList_ = other.teamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTeamListIsMutable();
              teamList_.addAll(other.teamList_);
            }
            onChanged();
          }
        } else {
          if (!other.teamList_.isEmpty()) {
            if (teamListBuilder_.isEmpty()) {
              teamListBuilder_.dispose();
              teamListBuilder_ = null;
              teamList_ = other.teamList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              teamListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTeamListFieldBuilder() : null;
            } else {
              teamListBuilder_.addAllMessages(other.teamList_);
            }
          }
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
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
        emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 12;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 12;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData> teamList_ =
        java.util.Collections.emptyList();
      private void ensureTeamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          teamList_ = new java.util.ArrayList<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData>(teamList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> teamListBuilder_;

      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData> getTeamListList() {
        if (teamListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(teamList_);
        } else {
          return teamListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public int getTeamListCount() {
        if (teamListBuilder_ == null) {
          return teamList_.size();
        } else {
          return teamListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData getTeamList(int index) {
        if (teamListBuilder_ == null) {
          return teamList_.get(index);
        } else {
          return teamListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder setTeamList(
          int index, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData value) {
        if (teamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamListIsMutable();
          teamList_.set(index, value);
          onChanged();
        } else {
          teamListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder setTeamList(
          int index, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder builderForValue) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.set(index, builderForValue.build());
          onChanged();
        } else {
          teamListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder addTeamList(emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData value) {
        if (teamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamListIsMutable();
          teamList_.add(value);
          onChanged();
        } else {
          teamListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder addTeamList(
          int index, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData value) {
        if (teamListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTeamListIsMutable();
          teamList_.add(index, value);
          onChanged();
        } else {
          teamListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder addTeamList(
          emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder builderForValue) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.add(builderForValue.build());
          onChanged();
        } else {
          teamListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder addTeamList(
          int index, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder builderForValue) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.add(index, builderForValue.build());
          onChanged();
        } else {
          teamListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder addAllTeamList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData> values) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, teamList_);
          onChanged();
        } else {
          teamListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder clearTeamList() {
        if (teamListBuilder_ == null) {
          teamList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          teamListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public Builder removeTeamList(int index) {
        if (teamListBuilder_ == null) {
          ensureTeamListIsMutable();
          teamList_.remove(index);
          onChanged();
        } else {
          teamListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder getTeamListBuilder(
          int index) {
        return getTeamListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder getTeamListOrBuilder(
          int index) {
        if (teamListBuilder_ == null) {
          return teamList_.get(index);  } else {
          return teamListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
           getTeamListOrBuilderList() {
        if (teamListBuilder_ != null) {
          return teamListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(teamList_);
        }
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder addTeamListBuilder() {
        return getTeamListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.getDefaultInstance());
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder addTeamListBuilder(
          int index) {
        return getTeamListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.getDefaultInstance());
      }
      /**
       * <code>repeated .SumoTeamData team_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder> 
           getTeamListBuilderList() {
        return getTeamListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder> 
          getTeamListFieldBuilder() {
        if (teamListBuilder_ == null) {
          teamListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamData.Builder, emu.grasscutter.net.proto.SumoTeamDataOuterClass.SumoTeamDataOrBuilder>(
                  teamList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          teamList_ = null;
        }
        return teamListBuilder_;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 10;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 10;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 8;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 8;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SumoSaveTeamReq)
    }

    // @@protoc_insertion_point(class_scope:SumoSaveTeamReq)
    private static final emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq();
    }

    public static emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoSaveTeamReq>
        PARSER = new com.google.protobuf.AbstractParser<SumoSaveTeamReq>() {
      @java.lang.Override
      public SumoSaveTeamReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SumoSaveTeamReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoSaveTeamReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoSaveTeamReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SumoSaveTeamReqOuterClass.SumoSaveTeamReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoSaveTeamReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoSaveTeamReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025SumoSaveTeamReq.proto\032\022SumoTeamData.pr" +
      "oto\"q\n\017SumoSaveTeamReq\022\023\n\013activity_id\030\014 " +
      "\001(\r\022 \n\tteam_list\030\016 \003(\0132\r.SumoTeamData\022\020\n" +
      "\010stage_id\030\n \001(\r\022\025\n\rdifficulty_id\030\010 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SumoTeamDataOuterClass.getDescriptor(),
        });
    internal_static_SumoSaveTeamReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoSaveTeamReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoSaveTeamReq_descriptor,
        new java.lang.String[] { "ActivityId", "TeamList", "StageId", "DifficultyId", });
    emu.grasscutter.net.proto.SumoTeamDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
