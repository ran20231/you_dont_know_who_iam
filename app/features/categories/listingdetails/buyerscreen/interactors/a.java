package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OtherAdsSections.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: OtherAdsSections.kt */
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0278a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final int f26041a;

        public C0278a(int i11) {
            super(null);
            this.f26041a = i11;
        }

        public final int a() {
            return this.f26041a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0278a) && this.f26041a == ((C0278a) obj).f26041a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f26041a);
        }

        public String toString() {
            int i11 = this.f26041a;
            return "RecommendedAds(adId=" + i11 + ")";
        }
    }

    /* compiled from: OtherAdsSections.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final int f26042a;

        public b(int i11) {
            super(null);
            this.f26042a = i11;
        }

        public final int a() {
            return this.f26042a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f26042a == ((b) obj).f26042a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f26042a);
        }

        public String toString() {
            int i11 = this.f26042a;
            return "SimilarAds(catID=" + i11 + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
