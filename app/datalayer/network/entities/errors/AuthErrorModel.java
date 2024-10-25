package com.forsale.app.datalayer.network.entities.errors;

import com.forsale.app.datalayer.network.entities.UserStatus;
import com.google.gson.d;
import com.leanplum.internal.Constants;
import dj.i;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.w;
import up.c;
/* compiled from: AuthErrorModel.kt */
/* loaded from: classes2.dex */
public final class AuthErrorModel {
    @c("errors")
    private final Map<String, String> errors;
    @c(Constants.Params.MESSAGE)
    private final String message;
    private final UserStatus userStatus;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AuthErrorModel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthErrorModel parseErrorModel(HttpException exception) {
            String str;
            ResponseBody d11;
            o.i(exception, "exception");
            w<?> c11 = exception.c();
            if (c11 != null && (d11 = c11.d()) != null) {
                str = d11.string();
            } else {
                str = null;
            }
            try {
                Object k11 = new d().k(str, AuthErrorModel.class);
                o.f(k11);
                return (AuthErrorModel) k11;
            } catch (Exception e11) {
                i.f54287a.invoke().f(e11);
                return new AuthErrorModel(null, null, null, 4, null);
            }
        }
    }

    public AuthErrorModel(String str, Map<String, String> map, UserStatus userStatus) {
        o.i(userStatus, "userStatus");
        this.message = str;
        this.errors = map;
        this.userStatus = userStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthErrorModel copy$default(AuthErrorModel authErrorModel, String str, Map map, UserStatus userStatus, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authErrorModel.message;
        }
        if ((i11 & 2) != 0) {
            map = authErrorModel.errors;
        }
        if ((i11 & 4) != 0) {
            userStatus = authErrorModel.userStatus;
        }
        return authErrorModel.copy(str, map, userStatus);
    }

    public final String component1() {
        return this.message;
    }

    public final Map<String, String> component2() {
        return this.errors;
    }

    public final UserStatus component3() {
        return this.userStatus;
    }

    public final AuthErrorModel copy(String str, Map<String, String> map, UserStatus userStatus) {
        o.i(userStatus, "userStatus");
        return new AuthErrorModel(str, map, userStatus);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthErrorModel)) {
            return false;
        }
        AuthErrorModel authErrorModel = (AuthErrorModel) obj;
        if (o.d(this.message, authErrorModel.message) && o.d(this.errors, authErrorModel.errors) && this.userStatus == authErrorModel.userStatus) {
            return true;
        }
        return false;
    }

    public final Map<String, String> getErrors() {
        return this.errors;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UserStatus getUserStatus() {
        return this.userStatus;
    }

    public int hashCode() {
        int hashCode;
        String str = this.message;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        Map<String, String> map = this.errors;
        if (map != null) {
            i11 = map.hashCode();
        }
        return ((i12 + i11) * 31) + this.userStatus.hashCode();
    }

    public String toString() {
        String str = this.message;
        Map<String, String> map = this.errors;
        UserStatus userStatus = this.userStatus;
        return "AuthErrorModel(message=" + str + ", errors=" + map + ", userStatus=" + userStatus + ")";
    }

    public /* synthetic */ AuthErrorModel(String str, Map map, UserStatus userStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i11 & 4) != 0 ? UserStatus.Authorized : userStatus);
    }
}
