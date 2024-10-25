package com.forsale.app.features.auth.utils;

import g00.l;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: AuthServerErrorsState.kt */
/* loaded from: classes2.dex */
public abstract class AuthServerErrorsState implements bj.c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22915b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f22916a;

    /* compiled from: AuthServerErrorsState.kt */
    /* loaded from: classes2.dex */
    public static final class ValidationError extends AuthServerErrorsState {

        /* renamed from: c  reason: collision with root package name */
        private final Map<String, String> f22917c;

        /* renamed from: d  reason: collision with root package name */
        private final String f22918d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationError(Map<String, String> errors, String str) {
            super(str, null);
            o.i(errors, "errors");
            this.f22917c = errors;
            this.f22918d = str;
        }

        public static /* synthetic */ void c(ValidationError validationError, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, l lVar7, int i11, Object obj) {
            AuthServerErrorsState$ValidationError$consumeFieldsErrors$1 authServerErrorsState$ValidationError$consumeFieldsErrors$1 = lVar;
            if ((i11 & 1) != 0) {
                authServerErrorsState$ValidationError$consumeFieldsErrors$1 = new l<String, p>() { // from class: com.forsale.app.features.auth.utils.AuthServerErrorsState$ValidationError$consumeFieldsErrors$1
                    public final void b(String it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
            }
            AuthServerErrorsState$ValidationError$consumeFieldsErrors$2 authServerErrorsState$ValidationError$consumeFieldsErrors$2 = lVar2;
            if ((i11 & 2) != 0) {
                authServerErrorsState$ValidationError$consumeFieldsErrors$2 = new l<String, p>() { // from class: com.forsale.app.features.auth.utils.AuthServerErrorsState$ValidationError$consumeFieldsErrors$2
                    public final void b(String it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
            }
            l lVar8 = authServerErrorsState$ValidationError$consumeFieldsErrors$2;
            AuthServerErrorsState$ValidationError$consumeFieldsErrors$3 authServerErrorsState$ValidationError$consumeFieldsErrors$3 = lVar3;
            if ((i11 & 4) != 0) {
                authServerErrorsState$ValidationError$consumeFieldsErrors$3 = new l<String, p>() { // from class: com.forsale.app.features.auth.utils.AuthServerErrorsState$ValidationError$consumeFieldsErrors$3
                    public final void b(String it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
            }
            l lVar9 = authServerErrorsState$ValidationError$consumeFieldsErrors$3;
            AuthServerErrorsState$ValidationError$consumeFieldsErrors$4 authServerErrorsState$ValidationError$consumeFieldsErrors$4 = lVar4;
            if ((i11 & 8) != 0) {
                authServerErrorsState$ValidationError$consumeFieldsErrors$4 = new l<String, p>() { // from class: com.forsale.app.features.auth.utils.AuthServerErrorsState$ValidationError$consumeFieldsErrors$4
                    public final void b(String it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
            }
            l lVar10 = authServerErrorsState$ValidationError$consumeFieldsErrors$4;
            AuthServerErrorsState$ValidationError$consumeFieldsErrors$5 authServerErrorsState$ValidationError$consumeFieldsErrors$5 = lVar5;
            if ((i11 & 16) != 0) {
                authServerErrorsState$ValidationError$consumeFieldsErrors$5 = new l<String, p>() { // from class: com.forsale.app.features.auth.utils.AuthServerErrorsState$ValidationError$consumeFieldsErrors$5
                    public final void b(String it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
            }
            l lVar11 = authServerErrorsState$ValidationError$consumeFieldsErrors$5;
            AuthServerErrorsState$ValidationError$consumeFieldsErrors$6 authServerErrorsState$ValidationError$consumeFieldsErrors$6 = lVar6;
            if ((i11 & 32) != 0) {
                authServerErrorsState$ValidationError$consumeFieldsErrors$6 = new l<String, p>() { // from class: com.forsale.app.features.auth.utils.AuthServerErrorsState$ValidationError$consumeFieldsErrors$6
                    public final void b(String it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
            }
            l lVar12 = authServerErrorsState$ValidationError$consumeFieldsErrors$6;
            AuthServerErrorsState$ValidationError$consumeFieldsErrors$7 authServerErrorsState$ValidationError$consumeFieldsErrors$7 = lVar7;
            if ((i11 & 64) != 0) {
                authServerErrorsState$ValidationError$consumeFieldsErrors$7 = new l<String, p>() { // from class: com.forsale.app.features.auth.utils.AuthServerErrorsState$ValidationError$consumeFieldsErrors$7
                    public final void b(String it2) {
                        o.i(it2, "it");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(String str) {
                        b(str);
                        return p.f75480a;
                    }
                };
            }
            validationError.b(authServerErrorsState$ValidationError$consumeFieldsErrors$1, lVar8, lVar9, lVar10, lVar11, lVar12, authServerErrorsState$ValidationError$consumeFieldsErrors$7);
        }

        public final void b(l<? super String, p> onPhoneNumberError, l<? super String, p> onOldPasswordError, l<? super String, p> onNewPasswordError, l<? super String, p> onOtpError, l<? super String, p> onEmailError, l<? super String, p> onNameError, l<? super String, p> errorMessage) {
            o.i(onPhoneNumberError, "onPhoneNumberError");
            o.i(onOldPasswordError, "onOldPasswordError");
            o.i(onNewPasswordError, "onNewPasswordError");
            o.i(onOtpError, "onOtpError");
            o.i(onEmailError, "onEmailError");
            o.i(onNameError, "onNameError");
            o.i(errorMessage, "errorMessage");
            String str = this.f22917c.get("phone");
            if (str != null) {
                onPhoneNumberError.invoke(str);
            }
            String str2 = this.f22917c.get("password");
            if (str2 != null) {
                onOldPasswordError.invoke(str2);
            }
            String str3 = this.f22917c.get("new_password");
            if (str3 != null) {
                onNewPasswordError.invoke(str3);
            }
            String str4 = this.f22917c.get("otp");
            if (str4 != null) {
                onOtpError.invoke(str4);
            }
            String str5 = this.f22917c.get("email");
            if (str5 != null) {
                onEmailError.invoke(str5);
            }
            String str6 = this.f22917c.get("name");
            if (str6 != null) {
                onNameError.invoke(str6);
            }
            String str7 = this.f22918d;
            if (str7 != null) {
                errorMessage.invoke(str7);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationError)) {
                return false;
            }
            ValidationError validationError = (ValidationError) obj;
            if (o.d(this.f22917c, validationError.f22917c) && o.d(this.f22918d, validationError.f22918d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f22917c.hashCode() * 31;
            String str = this.f22918d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            Map<String, String> map = this.f22917c;
            String str = this.f22918d;
            return "ValidationError(errors=" + map + ", message=" + str + ")";
        }
    }

    /* compiled from: AuthServerErrorsState.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(bj.c cVar, g00.a<p> unauthorizedCallbackError, g00.a<p> userBlockedCallbackError, g00.a<p> otherErrorCallback) {
            o.i(cVar, "<this>");
            o.i(unauthorizedCallbackError, "unauthorizedCallbackError");
            o.i(userBlockedCallbackError, "userBlockedCallbackError");
            o.i(otherErrorCallback, "otherErrorCallback");
            if (cVar instanceof c) {
                unauthorizedCallbackError.invoke();
            } else if (cVar instanceof b) {
                userBlockedCallbackError.invoke();
            } else {
                otherErrorCallback.invoke();
            }
        }
    }

    /* compiled from: AuthServerErrorsState.kt */
    /* loaded from: classes2.dex */
    public static final class b extends AuthServerErrorsState {

        /* renamed from: c  reason: collision with root package name */
        private final String f22926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String message) {
            super(message, null);
            o.i(message, "message");
            this.f22926c = message;
        }

        public final String b() {
            return this.f22926c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && o.d(this.f22926c, ((b) obj).f22926c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22926c.hashCode();
        }

        public String toString() {
            String str = this.f22926c;
            return "UserBlockedError(message=" + str + ")";
        }
    }

    /* compiled from: AuthServerErrorsState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends AuthServerErrorsState {

        /* renamed from: c  reason: collision with root package name */
        private final String f22927c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String message) {
            super(message, null);
            o.i(message, "message");
            this.f22927c = message;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && o.d(this.f22927c, ((c) obj).f22927c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22927c.hashCode();
        }

        public String toString() {
            String str = this.f22927c;
            return "UserUnauthorizedError(message=" + str + ")";
        }
    }

    public /* synthetic */ AuthServerErrorsState(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f22916a;
    }

    private AuthServerErrorsState(String str) {
        this.f22916a = str;
    }
}
