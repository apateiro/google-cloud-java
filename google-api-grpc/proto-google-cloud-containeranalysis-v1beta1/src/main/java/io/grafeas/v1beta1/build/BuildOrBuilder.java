// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/build/build.proto

package io.grafeas.v1beta1.build;

public interface BuildOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.build.Build)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of the builder which produced this Note.
   * </pre>
   *
   * <code>string builder_version = 1;</code>
   */
  java.lang.String getBuilderVersion();
  /**
   * <pre>
   * Version of the builder which produced this Note.
   * </pre>
   *
   * <code>string builder_version = 1;</code>
   */
  com.google.protobuf.ByteString
      getBuilderVersionBytes();

  /**
   * <pre>
   * Signature of the build in Occurrences pointing to the Note containing this
   * `BuilderDetails`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   */
  boolean hasSignature();
  /**
   * <pre>
   * Signature of the build in Occurrences pointing to the Note containing this
   * `BuilderDetails`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   */
  io.grafeas.v1beta1.build.BuildSignature getSignature();
  /**
   * <pre>
   * Signature of the build in Occurrences pointing to the Note containing this
   * `BuilderDetails`.
   * </pre>
   *
   * <code>.grafeas.v1beta1.build.BuildSignature signature = 2;</code>
   */
  io.grafeas.v1beta1.build.BuildSignatureOrBuilder getSignatureOrBuilder();
}
