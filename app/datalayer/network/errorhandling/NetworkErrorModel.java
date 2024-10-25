package com.forsale.app.datalayer.network.errorhandling;

import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: NetworkErrorModel.kt */
/* loaded from: classes2.dex */
public final class NetworkErrorModel {
    public static final int $stable = 8;
    private final int code;
    private final List<Error> errors;
    private final String message;

    /* compiled from: NetworkErrorModel.kt */
    /* loaded from: classes2.dex */
    public static final class Error {
        public static final int $stable = 0;
        private final String message;
        private final String type;

        public Error(String str, String str2) {
            this.type = str;
            this.message = str2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.type;
            }
            if ((i11 & 2) != 0) {
                str2 = error.message;
            }
            return error.copy(str, str2);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.message;
        }

        public final Error copy(String str, String str2) {
            return new Error(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            if (o.d(this.type, error.type) && o.d(this.message, error.message)) {
                return true;
            }
            return false;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int hashCode;
            String str = this.type;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.message;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            String str = this.type;
            String str2 = this.message;
            return "Error(type=" + str + ", message=" + str2 + ")";
        }
    }

    public NetworkErrorModel(int i11, String str, List<Error> list) {
        this.code = i11;
        this.message = str;
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkErrorModel copy$default(NetworkErrorModel networkErrorModel, int i11, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = networkErrorModel.code;
        }
        if ((i12 & 2) != 0) {
            str = networkErrorModel.message;
        }
        if ((i12 & 4) != 0) {
            list = networkErrorModel.errors;
        }
        return networkErrorModel.copy(i11, str, list);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final List<Error> component3() {
        return this.errors;
    }

    public final NetworkErrorModel copy(int i11, String str, List<Error> list) {
        return new NetworkErrorModel(i11, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkErrorModel)) {
            return false;
        }
        NetworkErrorModel networkErrorModel = (NetworkErrorModel) obj;
        if (this.code == networkErrorModel.code && o.d(this.message, networkErrorModel.message) && o.d(this.errors, networkErrorModel.errors)) {
            return true;
        }
        return false;
    }

    public final int getCode() {
        return this.code;
    }

    public final List<Error> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.code) * 31;
        String str = this.message;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        List<Error> list = this.errors;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        int i11 = this.code;
        String str = this.message;
        List<Error> list = this.errors;
        return "NetworkErrorModel(code=" + i11 + ", message=" + str + ", errors=" + list + ")";
    }
}
