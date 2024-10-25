package com.forsale.app.features.categories.listings.items.horizontalListing;

import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import kotlin.jvm.internal.o;
/* compiled from: HorizontalListingContentType.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: HorizontalListingContentType.kt */
    /* renamed from: com.forsale.app.features.categories.listings.items.horizontalListing.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0336a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final CommercialItemDetailsSource f30784a;

        /* renamed from: b  reason: collision with root package name */
        private final int f30785b;

        /* renamed from: c  reason: collision with root package name */
        private final int f30786c;

        public C0336a(CommercialItemDetailsSource source, int i11, int i12) {
            o.i(source, "source");
            this.f30784a = source;
            this.f30785b = i11;
            this.f30786c = i12;
        }

        public final int a() {
            return this.f30786c;
        }

        public final int b() {
            return this.f30785b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0336a)) {
                return false;
            }
            C0336a c0336a = (C0336a) obj;
            if (this.f30784a == c0336a.f30784a && this.f30785b == c0336a.f30785b && this.f30786c == c0336a.f30786c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f30784a.hashCode() * 31) + Integer.hashCode(this.f30785b)) * 31) + Integer.hashCode(this.f30786c);
        }

        public String toString() {
            CommercialItemDetailsSource commercialItemDetailsSource = this.f30784a;
            int i11 = this.f30785b;
            int i12 = this.f30786c;
            return "CommercialPinningList(source=" + commercialItemDetailsSource + ", totalItemsCount=" + i11 + ", sourcePinningRowsCount=" + i12 + ")";
        }
    }
}
