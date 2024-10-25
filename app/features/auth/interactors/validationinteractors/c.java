package com.forsale.app.features.auth.interactors.validationinteractors;

import kotlin.jvm.internal.o;
/* compiled from: FieldSourceType.kt */
/* loaded from: classes2.dex */
public interface c {

    /* compiled from: FieldSourceType.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22738a = new a();

        private a() {
        }
    }

    /* compiled from: FieldSourceType.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final ChangePasswordFieldType f22739a;

        public b(ChangePasswordFieldType changePasswordFieldType) {
            o.i(changePasswordFieldType, "changePasswordFieldType");
            this.f22739a = changePasswordFieldType;
        }

        public final ChangePasswordFieldType a() {
            return this.f22739a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f22739a == ((b) obj).f22739a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22739a.hashCode();
        }

        public String toString() {
            ChangePasswordFieldType changePasswordFieldType = this.f22739a;
            return "ChangePassword(changePasswordFieldType=" + changePasswordFieldType + ")";
        }
    }
}
