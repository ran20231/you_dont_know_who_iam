package com.forsale.app.datalayer.network;

import com.forsale.app.datalayer.network.ResponseWrapper;
import com.leanplum.internal.Constants;
import falcon.chat.entities.MessageKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: ResponseWrapperKtor.kt */
@Serializable
/* loaded from: classes2.dex */
public final class ResponseWrapperKtor<T> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final ResponseWrapper.ResponseError error;
    private final T response;
    private final int status;

    /* compiled from: ResponseWrapperKtor.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T0> KSerializer<ResponseWrapperKtor<T0>> serializer(KSerializer<T0> typeSerial0) {
            o.i(typeSerial0, "typeSerial0");
            return new ResponseWrapperKtor$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.forsale.app.datalayer.network.ResponseWrapperKtor", null, 3);
        pluginGeneratedSerialDescriptor.addElement(MessageKt.STATUS, false);
        pluginGeneratedSerialDescriptor.addElement(Constants.Params.RESPONSE, false);
        pluginGeneratedSerialDescriptor.addElement("error", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ResponseWrapperKtor(int i11, int i12, Object obj, ResponseWrapper.ResponseError responseError, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i11 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 7, $cachedDescriptor);
        }
        this.status = i12;
        this.response = obj;
        this.error = responseError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseWrapperKtor copy$default(ResponseWrapperKtor responseWrapperKtor, int i11, Object obj, ResponseWrapper.ResponseError responseError, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = responseWrapperKtor.status;
        }
        if ((i12 & 2) != 0) {
            obj = responseWrapperKtor.response;
        }
        if ((i12 & 4) != 0) {
            responseError = responseWrapperKtor.error;
        }
        return responseWrapperKtor.copy(i11, obj, responseError);
    }

    public static final /* synthetic */ void write$Self(ResponseWrapperKtor responseWrapperKtor, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, responseWrapperKtor.status);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializer, responseWrapperKtor.response);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ResponseWrapper$ResponseError$$serializer.INSTANCE, responseWrapperKtor.error);
    }

    public final int component1() {
        return this.status;
    }

    public final T component2() {
        return this.response;
    }

    public final ResponseWrapper.ResponseError component3() {
        return this.error;
    }

    public final ResponseWrapperKtor<T> copy(int i11, T t11, ResponseWrapper.ResponseError responseError) {
        return new ResponseWrapperKtor<>(i11, t11, responseError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseWrapperKtor)) {
            return false;
        }
        ResponseWrapperKtor responseWrapperKtor = (ResponseWrapperKtor) obj;
        if (this.status == responseWrapperKtor.status && o.d(this.response, responseWrapperKtor.response) && o.d(this.error, responseWrapperKtor.error)) {
            return true;
        }
        return false;
    }

    public final ResponseWrapper.ResponseError getError() {
        return this.error;
    }

    public final T getResponse() {
        return this.response;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.status) * 31;
        T t11 = this.response;
        int i11 = 0;
        if (t11 == null) {
            hashCode = 0;
        } else {
            hashCode = t11.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        ResponseWrapper.ResponseError responseError = this.error;
        if (responseError != null) {
            i11 = responseError.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        int i11 = this.status;
        T t11 = this.response;
        ResponseWrapper.ResponseError responseError = this.error;
        return "ResponseWrapperKtor(status=" + i11 + ", response=" + t11 + ", error=" + responseError + ")";
    }

    public ResponseWrapperKtor(int i11, T t11, ResponseWrapper.ResponseError responseError) {
        this.status = i11;
        this.response = t11;
        this.error = responseError;
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public static /* synthetic */ void getResponse$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }
}
