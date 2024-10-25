package com.forsale.adserver.view.screens.ui;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g9.d;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: OffersScreenUiState.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: OffersScreenUiState.kt */
    /* renamed from: com.forsale.adserver.view.screens.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0243a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f21596a;

        public C0243a(Throwable throwable) {
            o.i(throwable, "throwable");
            this.f21596a = throwable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0243a) && o.d(this.f21596a, ((C0243a) obj).f21596a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f21596a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f21596a;
            return "Error(throwable=" + th2 + ")";
        }
    }

    /* compiled from: OffersScreenUiState.kt */
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21597a = new b();

        private b() {
        }
    }

    /* compiled from: OffersScreenUiState.kt */
    /* loaded from: classes2.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        private final List<n9.a> f21598a;

        /* renamed from: b  reason: collision with root package name */
        private final AdManagerAdRequest f21599b;

        /* renamed from: c  reason: collision with root package name */
        private final List<d> f21600c;

        public c(List<n9.a> offersCategoryList, AdManagerAdRequest adManagerAdRequest, List<d> list) {
            o.i(offersCategoryList, "offersCategoryList");
            this.f21598a = offersCategoryList;
            this.f21599b = adManagerAdRequest;
            this.f21600c = list;
        }

        public final AdManagerAdRequest a() {
            return this.f21599b;
        }

        public final List<n9.a> b() {
            return this.f21598a;
        }

        public final List<d> c() {
            return this.f21600c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (o.d(this.f21598a, cVar.f21598a) && o.d(this.f21599b, cVar.f21599b) && o.d(this.f21600c, cVar.f21600c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f21598a.hashCode() * 31;
            AdManagerAdRequest adManagerAdRequest = this.f21599b;
            int i11 = 0;
            if (adManagerAdRequest == null) {
                hashCode = 0;
            } else {
                hashCode = adManagerAdRequest.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            List<d> list = this.f21600c;
            if (list != null) {
                i11 = list.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            List<n9.a> list = this.f21598a;
            AdManagerAdRequest adManagerAdRequest = this.f21599b;
            List<d> list2 = this.f21600c;
            return "Success(offersCategoryList=" + list + ", gamRequest=" + adManagerAdRequest + ", offersList=" + list2 + ")";
        }
    }
}
