package com.forsale.app.datalayer.network;

import com.forsale.app.utils.LocaleManager;
import com.leanplum.internal.Constants;
import falcon.chat.entities.MessageKt;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import up.c;
/* compiled from: ResponseWrapper.kt */
/* loaded from: classes2.dex */
public final class ResponseWrapper<T> {
    public static final int $stable = 0;
    @c("error")
    private final ResponseError error;
    @c(Constants.Params.RESPONSE)
    private final T response;
    @c(MessageKt.STATUS)
    private final int status;

    /* compiled from: ResponseWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class EmptyResponseWrapperException extends IOException {
        public static final int $stable = 0;

        public EmptyResponseWrapperException() {
            super("Empty for q84sale response not allowed");
        }
    }

    /* compiled from: ResponseWrapper.kt */
    @Serializable
    /* loaded from: classes2.dex */
    public static final class ResponseError {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        @c("code")
        private final int code;
        @c("message_ar")
        private final String messageAr;
        @c("message_en")
        private final String messageEn;

        /* compiled from: ResponseWrapper.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ResponseError> serializer() {
                return ResponseWrapper$ResponseError$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ResponseError(int i11, int i12, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i11 & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i11, 7, ResponseWrapper$ResponseError$$serializer.INSTANCE.getDescriptor());
            }
            this.code = i12;
            this.messageEn = str;
            this.messageAr = str2;
        }

        public static /* synthetic */ ResponseError copy$default(ResponseError responseError, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = responseError.code;
            }
            if ((i12 & 2) != 0) {
                str = responseError.messageEn;
            }
            if ((i12 & 4) != 0) {
                str2 = responseError.messageAr;
            }
            return responseError.copy(i11, str, str2);
        }

        public static final /* synthetic */ void write$Self(ResponseError responseError, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, responseError.code);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, responseError.messageEn);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, responseError.messageAr);
        }

        public final ResponseErrorException asServerErrorException() {
            int i11 = this.code;
            String str = this.messageEn;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.messageAr;
            if (str3 != null) {
                str2 = str3;
            }
            return new ResponseErrorException(i11, str, str2);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.messageEn;
        }

        public final String component3() {
            return this.messageAr;
        }

        public final ResponseError copy(int i11, String str, String str2) {
            return new ResponseError(i11, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseError)) {
                return false;
            }
            ResponseError responseError = (ResponseError) obj;
            if (this.code == responseError.code && o.d(this.messageEn, responseError.messageEn) && o.d(this.messageAr, responseError.messageAr)) {
                return true;
            }
            return false;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessageAr() {
            return this.messageAr;
        }

        public final String getMessageEn() {
            return this.messageEn;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = Integer.hashCode(this.code) * 31;
            String str = this.messageEn;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            String str2 = this.messageAr;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            int i11 = this.code;
            String str = this.messageEn;
            String str2 = this.messageAr;
            return "ResponseError(code=" + i11 + ", messageEn=" + str + ", messageAr=" + str2 + ")";
        }

        public ResponseError(int i11, String str, String str2) {
            this.code = i11;
            this.messageEn = str;
            this.messageAr = str2;
        }

        public static /* synthetic */ void getCode$annotations() {
        }

        public static /* synthetic */ void getMessageAr$annotations() {
        }

        public static /* synthetic */ void getMessageEn$annotations() {
        }
    }

    /* compiled from: ResponseWrapper.kt */
    /* loaded from: classes2.dex */
    public static final class ResponseErrorException extends IOException {
        public static final int $stable = 0;
        private final int code;
        private final String messageAr;
        private final String messageEn;

        public ResponseErrorException(int i11, String messageEn, String messageAr) {
            o.i(messageEn, "messageEn");
            o.i(messageAr, "messageAr");
            this.code = i11;
            this.messageEn = messageEn;
            this.messageAr = messageAr;
        }

        public static /* synthetic */ ResponseErrorException copy$default(ResponseErrorException responseErrorException, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = responseErrorException.code;
            }
            if ((i12 & 2) != 0) {
                str = responseErrorException.messageEn;
            }
            if ((i12 & 4) != 0) {
                str2 = responseErrorException.messageAr;
            }
            return responseErrorException.copy(i11, str, str2);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.messageEn;
        }

        public final String component3() {
            return this.messageAr;
        }

        public final ResponseErrorException copy(int i11, String messageEn, String messageAr) {
            o.i(messageEn, "messageEn");
            o.i(messageAr, "messageAr");
            return new ResponseErrorException(i11, messageEn, messageAr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResponseErrorException)) {
                return false;
            }
            ResponseErrorException responseErrorException = (ResponseErrorException) obj;
            if (this.code == responseErrorException.code && o.d(this.messageEn, responseErrorException.messageEn) && o.d(this.messageAr, responseErrorException.messageAr)) {
                return true;
            }
            return false;
        }

        public final int getCode() {
            return this.code;
        }

        @Override // java.lang.Throwable
        public String getLocalizedMessage() {
            if (LocaleManager.f39597a.r()) {
                return this.messageAr;
            }
            return this.messageEn;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            int i11 = this.code;
            String str = this.messageEn;
            return "Code: " + i11 + "\nMessage: " + str;
        }

        public final String getMessageAr() {
            return this.messageAr;
        }

        public final String getMessageEn() {
            return this.messageEn;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.code) * 31) + this.messageEn.hashCode()) * 31) + this.messageAr.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            int i11 = this.code;
            String str = this.messageEn;
            String str2 = this.messageAr;
            return "ResponseErrorException(code=" + i11 + ", messageEn=" + str + ", messageAr=" + str2 + ")";
        }
    }

    public ResponseWrapper(int i11, T t11, ResponseError responseError) {
        this.status = i11;
        this.response = t11;
        this.error = responseError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResponseWrapper copy$default(ResponseWrapper responseWrapper, int i11, Object obj, ResponseError responseError, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = responseWrapper.status;
        }
        if ((i12 & 2) != 0) {
            obj = responseWrapper.response;
        }
        if ((i12 & 4) != 0) {
            responseError = responseWrapper.error;
        }
        return responseWrapper.copy(i11, obj, responseError);
    }

    public final int component1() {
        return this.status;
    }

    public final T component2() {
        return this.response;
    }

    public final ResponseError component3() {
        return this.error;
    }

    public final ResponseWrapper<T> copy(int i11, T t11, ResponseError responseError) {
        return new ResponseWrapper<>(i11, t11, responseError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseWrapper)) {
            return false;
        }
        ResponseWrapper responseWrapper = (ResponseWrapper) obj;
        if (this.status == responseWrapper.status && o.d(this.response, responseWrapper.response) && o.d(this.error, responseWrapper.error)) {
            return true;
        }
        return false;
    }

    public final ResponseError getError() {
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
        ResponseError responseError = this.error;
        if (responseError != null) {
            i11 = responseError.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        int i11 = this.status;
        T t11 = this.response;
        ResponseError responseError = this.error;
        return "ResponseWrapper(status=" + i11 + ", response=" + t11 + ", error=" + responseError + ")";
    }
}
