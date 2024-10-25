package com.forsale.app.features.auth.interactors.validationinteractors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ValidationResult.kt */
/* loaded from: classes2.dex */
public abstract class h {

    /* compiled from: ValidationResult.kt */
    /* loaded from: classes2.dex */
    public static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        private final ValidationMessages f22740a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ValidationMessages error) {
            super(null);
            o.i(error, "error");
            this.f22740a = error;
        }

        public final ValidationMessages a() {
            return this.f22740a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f22740a == ((a) obj).f22740a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22740a.hashCode();
        }

        public String toString() {
            ValidationMessages validationMessages = this.f22740a;
            return "Error(error=" + validationMessages + ")";
        }
    }

    /* compiled from: ValidationResult.kt */
    /* loaded from: classes2.dex */
    public static final class b extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22741a = new b();

        private b() {
            super(null);
        }
    }

    private h() {
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
