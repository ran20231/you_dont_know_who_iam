package com.forsale.app.features.categories.listingdetails.buyerscreen;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BuyerUiState.kt */
/* loaded from: classes2.dex */
public abstract class t {

    /* compiled from: BuyerUiState.kt */
    /* loaded from: classes2.dex */
    public static final class a extends t {

        /* renamed from: a  reason: collision with root package name */
        private final q f26512a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q buyerDetailsState) {
            super(null);
            kotlin.jvm.internal.o.i(buyerDetailsState, "buyerDetailsState");
            this.f26512a = buyerDetailsState;
        }

        public final q a() {
            return this.f26512a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.o.d(this.f26512a, ((a) obj).f26512a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f26512a.hashCode();
        }

        public String toString() {
            q qVar = this.f26512a;
            return "Content(buyerDetailsState=" + qVar + ")";
        }
    }

    /* compiled from: BuyerUiState.kt */
    /* loaded from: classes2.dex */
    public static final class b extends t {

        /* renamed from: a  reason: collision with root package name */
        private final bj.b f26513a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(bj.b errorHandler) {
            super(null);
            kotlin.jvm.internal.o.i(errorHandler, "errorHandler");
            this.f26513a = errorHandler;
        }

        public final bj.b a() {
            return this.f26513a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.o.d(this.f26513a, ((b) obj).f26513a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f26513a.hashCode();
        }

        public String toString() {
            bj.b bVar = this.f26513a;
            return "CustomError(errorHandler=" + bVar + ")";
        }
    }

    /* compiled from: BuyerUiState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends t {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f26514a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable throwable) {
            super(null);
            kotlin.jvm.internal.o.i(throwable, "throwable");
            this.f26514a = throwable;
        }

        public final Throwable a() {
            return this.f26514a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.o.d(this.f26514a, ((c) obj).f26514a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f26514a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f26514a;
            return "Error(throwable=" + th2 + ")";
        }
    }

    /* compiled from: BuyerUiState.kt */
    /* loaded from: classes2.dex */
    public static final class d extends t {

        /* renamed from: a  reason: collision with root package name */
        public static final d f26515a = new d();

        private d() {
            super(null);
        }
    }

    private t() {
    }

    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
