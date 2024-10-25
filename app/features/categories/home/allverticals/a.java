package com.forsale.app.features.categories.home.allverticals;

import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AllVerticalsEvents.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: AllVerticalsEvents.kt */
    /* renamed from: com.forsale.app.features.categories.home.allverticals.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0259a implements a {

        /* compiled from: AllVerticalsEvents.kt */
        /* renamed from: com.forsale.app.features.categories.home.allverticals.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0260a implements a {

            /* renamed from: d  reason: collision with root package name */
            public static final int f23467d = com.forsale.adserver.view.screens.detailsScreen.a.f21347j | AdsModel.A;

            /* renamed from: a  reason: collision with root package name */
            private final AdsModel f23468a;

            /* renamed from: b  reason: collision with root package name */
            private final com.forsale.adserver.view.screens.detailsScreen.a f23469b;

            /* renamed from: c  reason: collision with root package name */
            private final HomeVisitedSources f23470c;

            public C0260a(AdsModel adsModel, com.forsale.adserver.view.screens.detailsScreen.a commercialDetailsAnalyticPayload, HomeVisitedSources homeVisitedSources) {
                o.i(adsModel, "adsModel");
                o.i(commercialDetailsAnalyticPayload, "commercialDetailsAnalyticPayload");
                this.f23468a = adsModel;
                this.f23469b = commercialDetailsAnalyticPayload;
                this.f23470c = homeVisitedSources;
            }

            public final AdsModel a() {
                return this.f23468a;
            }

            public final com.forsale.adserver.view.screens.detailsScreen.a b() {
                return this.f23469b;
            }

            public final HomeVisitedSources c() {
                return this.f23470c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0260a)) {
                    return false;
                }
                C0260a c0260a = (C0260a) obj;
                if (o.d(this.f23468a, c0260a.f23468a) && o.d(this.f23469b, c0260a.f23469b) && this.f23470c == c0260a.f23470c) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((this.f23468a.hashCode() * 31) + this.f23469b.hashCode()) * 31;
                HomeVisitedSources homeVisitedSources = this.f23470c;
                if (homeVisitedSources == null) {
                    hashCode = 0;
                } else {
                    hashCode = homeVisitedSources.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                AdsModel adsModel = this.f23468a;
                com.forsale.adserver.view.screens.detailsScreen.a aVar = this.f23469b;
                HomeVisitedSources homeVisitedSources = this.f23470c;
                return "NavigateToCommercialDetails(adsModel=" + adsModel + ", commercialDetailsAnalyticPayload=" + aVar + ", source=" + homeVisitedSources + ")";
            }
        }

        /* compiled from: AllVerticalsEvents.kt */
        /* renamed from: com.forsale.app.features.categories.home.allverticals.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC0259a {

            /* renamed from: a  reason: collision with root package name */
            private final CategoryEntity f23471a;

            /* renamed from: b  reason: collision with root package name */
            private final CategoryListingsAnalyticSource f23472b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CategoryEntity categoryEntity, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
                super(null);
                o.i(categoryEntity, "categoryEntity");
                this.f23471a = categoryEntity;
                this.f23472b = categoryListingsAnalyticSource;
            }

            public final CategoryListingsAnalyticSource a() {
                return this.f23472b;
            }

            public final CategoryEntity b() {
                return this.f23471a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (o.d(this.f23471a, bVar.f23471a) && o.d(this.f23472b, bVar.f23472b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.f23471a.hashCode() * 31;
                CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23472b;
                if (categoryListingsAnalyticSource == null) {
                    hashCode = 0;
                } else {
                    hashCode = categoryListingsAnalyticSource.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                CategoryEntity categoryEntity = this.f23471a;
                CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23472b;
                return "NavigateToListings(categoryEntity=" + categoryEntity + ", analyticsSource=" + categoryListingsAnalyticSource + ")";
            }
        }

        /* compiled from: AllVerticalsEvents.kt */
        /* renamed from: com.forsale.app.features.categories.home.allverticals.a$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends AbstractC0259a {

            /* renamed from: a  reason: collision with root package name */
            private final CategoryEntity f23473a;

            /* renamed from: b  reason: collision with root package name */
            private final CategoryListingsAnalyticSource f23474b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CategoryEntity categoryEntity, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
                super(null);
                o.i(categoryEntity, "categoryEntity");
                this.f23473a = categoryEntity;
                this.f23474b = categoryListingsAnalyticSource;
            }

            public final CategoryListingsAnalyticSource a() {
                return this.f23474b;
            }

            public final CategoryEntity b() {
                return this.f23473a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (o.d(this.f23473a, cVar.f23473a) && o.d(this.f23474b, cVar.f23474b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.f23473a.hashCode() * 31;
                CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23474b;
                if (categoryListingsAnalyticSource == null) {
                    hashCode = 0;
                } else {
                    hashCode = categoryListingsAnalyticSource.hashCode();
                }
                return hashCode2 + hashCode;
            }

            public String toString() {
                CategoryEntity categoryEntity = this.f23473a;
                CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23474b;
                return "NavigateToSubCategories(categoryEntity=" + categoryEntity + ", analyticsSource=" + categoryListingsAnalyticSource + ")";
            }
        }

        private AbstractC0259a() {
        }

        public /* synthetic */ AbstractC0259a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AllVerticalsEvents.kt */
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final int f23475a;

        /* renamed from: b  reason: collision with root package name */
        private final AdManagerAdRequest f23476b;

        public b(int i11, AdManagerAdRequest adManagerAdRequest) {
            o.i(adManagerAdRequest, "adManagerAdRequest");
            this.f23475a = i11;
            this.f23476b = adManagerAdRequest;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f23475a == bVar.f23475a && o.d(this.f23476b, bVar.f23476b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f23475a) * 31) + this.f23476b.hashCode();
        }

        public String toString() {
            int i11 = this.f23475a;
            AdManagerAdRequest adManagerAdRequest = this.f23476b;
            return "ShowInterstitial(categoryId=" + i11 + ", adManagerAdRequest=" + adManagerAdRequest + ")";
        }
    }
}
