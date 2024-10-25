package com.forsale.app.features.categories.listings.items.horizontalListing;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import com.forsale.app.utils.itemutils.TextHolder;
import com.forsale.app.utils.itemutils.ViewMargins;
import com.forsale.app.utils.itemutils.ViewSpacing;
import com.google.android.gms.ads.AdRequest;
import g00.l;
import gj.d;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import lj.a;
import qc.b;
import t9.p0;
import t9.r0;
import wz.h;
import wz.p;
/* compiled from: HorizontalListingsItemViewModel.kt */
/* loaded from: classes2.dex */
public final class HorizontalListingsItemViewModel extends b<List<? extends b<?>>> implements lj.a {

    /* renamed from: y */
    public static final Companion f30736y = new Companion(null);

    /* renamed from: z */
    public static final int f30737z = 8;

    /* renamed from: c */
    private final LiveData<List<b<?>>> f30738c;

    /* renamed from: d */
    private final bd.a f30739d;

    /* renamed from: e */
    private final int f30740e;

    /* renamed from: f */
    private final ViewSpacing f30741f;

    /* renamed from: g */
    private final ViewSpacing f30742g;

    /* renamed from: h */
    private final a f30743h;

    /* renamed from: i */
    private final h f30744i;

    /* renamed from: j */
    private final LiveData<ViewSpacing> f30745j;

    /* renamed from: x */
    private final LiveData<Boolean> f30746x;

    /* compiled from: HorizontalListingsItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ HorizontalListingsItemViewModel b(Companion companion, LiveData liveData, bd.a aVar, int i11, ViewSpacing viewSpacing, ViewSpacing viewSpacing2, a aVar2, int i12, Object obj) {
            ViewSpacing viewSpacing3;
            ViewSpacing viewSpacing4;
            a aVar3;
            if ((i12 & 8) != 0) {
                viewSpacing3 = null;
            } else {
                viewSpacing3 = viewSpacing;
            }
            if ((i12 & 16) != 0) {
                viewSpacing4 = null;
            } else {
                viewSpacing4 = viewSpacing2;
            }
            if ((i12 & 32) != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            return companion.a(liveData, aVar, i11, viewSpacing3, viewSpacing4, aVar3);
        }

        public static /* synthetic */ List d(Companion companion, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, ViewSpacing viewSpacing, bd.a aVar, int i11, ViewSpacing viewSpacing2, int i12, Object obj) {
            ViewSpacing viewSpacing3;
            bd.a aVar2;
            int i13;
            ViewSpacing viewSpacing4;
            if ((i12 & 16) != 0) {
                viewSpacing3 = d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel$Companion$createWithTitleSubtitle$1
                    public final void b(ViewSpacing viewSpacing5) {
                        o.i(viewSpacing5, "$this$viewSpacing");
                        viewSpacing5.c(new ViewMargins(null, null, Integer.valueOf(p0.f69713m), null, 11, null));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing5) {
                        b(viewSpacing5);
                        return p.f75480a;
                    }
                });
            } else {
                viewSpacing3 = viewSpacing;
            }
            if ((i12 & 32) != 0) {
                aVar2 = null;
            } else {
                aVar2 = aVar;
            }
            if ((i12 & 64) != 0) {
                i13 = 1;
            } else {
                i13 = i11;
            }
            if ((i12 & 128) != 0) {
                viewSpacing4 = null;
            } else {
                viewSpacing4 = viewSpacing2;
            }
            return companion.c(liveData, liveData2, liveData3, liveData4, viewSpacing3, aVar2, i13, viewSpacing4);
        }

        public static /* synthetic */ List f(Companion companion, LiveData liveData, LiveData liveData2, LiveData liveData3, LiveData liveData4, g00.a aVar, LiveData liveData5, ViewSpacing viewSpacing, bd.a aVar2, int i11, ViewSpacing viewSpacing2, ViewSpacing viewSpacing3, int i12, Object obj) {
            ViewSpacing viewSpacing4;
            bd.a aVar3;
            int i13;
            ViewSpacing viewSpacing5;
            ViewSpacing viewSpacing6;
            if ((i12 & 64) != 0) {
                viewSpacing4 = d.a(new l<ViewSpacing, p>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel$Companion$createWithTitleSubtitleAndSeeAllAction$1
                    public final void b(ViewSpacing viewSpacing7) {
                        o.i(viewSpacing7, "$this$viewSpacing");
                        viewSpacing7.c(new ViewMargins(null, null, Integer.valueOf(p0.f69713m), null, 11, null));
                        viewSpacing7.d(null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(ViewSpacing viewSpacing7) {
                        b(viewSpacing7);
                        return p.f75480a;
                    }
                });
            } else {
                viewSpacing4 = viewSpacing;
            }
            if ((i12 & 128) != 0) {
                aVar3 = null;
            } else {
                aVar3 = aVar2;
            }
            if ((i12 & 256) != 0) {
                i13 = 1;
            } else {
                i13 = i11;
            }
            if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                viewSpacing5 = null;
            } else {
                viewSpacing5 = viewSpacing2;
            }
            if ((i12 & 1024) != 0) {
                viewSpacing6 = null;
            } else {
                viewSpacing6 = viewSpacing3;
            }
            return companion.e(liveData, liveData2, liveData3, liveData4, aVar, liveData5, viewSpacing4, aVar3, i13, viewSpacing5, viewSpacing6);
        }

        public final HorizontalListingsItemViewModel a(LiveData<List<b<?>>> listings, bd.a aVar, int i11, ViewSpacing viewSpacing, ViewSpacing viewSpacing2, a aVar2) {
            o.i(listings, "listings");
            return new HorizontalListingsItemViewModel(listings, aVar, i11, viewSpacing, viewSpacing2, aVar2, null);
        }

        public final List<b<?>> c(LiveData<TextHolder> title, LiveData<TextHolder> subtitle, LiveData<List<b<?>>> listingsOrEmptyArtwork, LiveData<Boolean> isTitleSubtitleVisible, ViewSpacing titleSpacing, bd.a aVar, int i11, ViewSpacing viewSpacing) {
            List<b<?>> q11;
            o.i(title, "title");
            o.i(subtitle, "subtitle");
            o.i(listingsOrEmptyArtwork, "listingsOrEmptyArtwork");
            o.i(isTitleSubtitleVisible, "isTitleSubtitleVisible");
            o.i(titleSpacing, "titleSpacing");
            q11 = r.q(new gd.b(title, subtitle, titleSpacing, null, null, isTitleSubtitleVisible, 24, null), b(this, listingsOrEmptyArtwork, aVar, i11, viewSpacing, null, null, 48, null));
            return q11;
        }

        public final List<b<?>> e(LiveData<TextHolder> title, LiveData<TextHolder> subtitle, LiveData<List<b<?>>> listingsOrEmptyArtwork, LiveData<Boolean> isTitleSubtitleVisible, g00.a<p> seeAllAction, LiveData<Boolean> isSeeAllActionVisible, ViewSpacing titleSpacing, bd.a aVar, int i11, ViewSpacing viewSpacing, ViewSpacing viewSpacing2) {
            List<b<?>> q11;
            o.i(title, "title");
            o.i(subtitle, "subtitle");
            o.i(listingsOrEmptyArtwork, "listingsOrEmptyArtwork");
            o.i(isTitleSubtitleVisible, "isTitleSubtitleVisible");
            o.i(seeAllAction, "seeAllAction");
            o.i(isSeeAllActionVisible, "isSeeAllActionVisible");
            o.i(titleSpacing, "titleSpacing");
            q11 = r.q(new gd.b(title, subtitle, titleSpacing, seeAllAction, isSeeAllActionVisible, isTitleSubtitleVisible), b(this, listingsOrEmptyArtwork, aVar, i11, viewSpacing, viewSpacing2, null, 32, null));
            return q11;
        }
    }

    public /* synthetic */ HorizontalListingsItemViewModel(LiveData liveData, bd.a aVar, int i11, ViewSpacing viewSpacing, ViewSpacing viewSpacing2, a aVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(liveData, aVar, i11, viewSpacing, viewSpacing2, aVar2);
    }

    @Override // lj.a
    public Parcelable b(String str) {
        return a.C0733a.a(this, str);
    }

    @Override // lj.a
    public b0<Bundle> c() {
        return (b0) this.f30744i.getValue();
    }

    @Override // lj.a
    public void d(Parcelable parcelable, String str) {
        a.C0733a.c(this, parcelable, str);
    }

    public final bd.a g() {
        return this.f30739d;
    }

    public final a h() {
        return this.f30743h;
    }

    public final LiveData<List<b<?>>> i() {
        return this.f30738c;
    }

    public final LiveData<ViewSpacing> j() {
        return this.f30745j;
    }

    public final int k() {
        return this.f30740e;
    }

    public final LiveData<Boolean> l() {
        return this.f30746x;
    }

    private HorizontalListingsItemViewModel(LiveData<List<b<?>>> liveData, bd.a aVar, int i11, ViewSpacing viewSpacing, ViewSpacing viewSpacing2, a aVar2) {
        super(r0.f69925h4, null);
        h a11;
        this.f30738c = liveData;
        this.f30739d = aVar;
        this.f30740e = i11;
        this.f30741f = viewSpacing;
        this.f30742g = viewSpacing2;
        this.f30743h = aVar2;
        a11 = kotlin.d.a(new g00.a<b0<Bundle>>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel$layoutManagerState$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<Bundle> invoke() {
                return new b0<>();
            }
        });
        this.f30744i = a11;
        this.f30745j = Transformations.b(liveData, new l<List<b<?>>, ViewSpacing>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel$spacing$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
                r3 = r2.f30751a.f30742g;
             */
            @Override // g00.l
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.forsale.app.utils.itemutils.ViewSpacing invoke(java.util.List<qc.b<?>> r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.o.i(r3, r0)
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    boolean r0 = r3 instanceof java.util.Collection
                    r1 = 0
                    if (r0 == 0) goto L16
                    r0 = r3
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L16
                    goto L2b
                L16:
                    java.util.Iterator r3 = r3.iterator()
                L1a:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L2b
                    java.lang.Object r0 = r3.next()
                    qc.b r0 = (qc.b) r0
                    boolean r0 = r0 instanceof vc.b
                    if (r0 == 0) goto L1a
                    r1 = 1
                L2b:
                    if (r1 == 0) goto L35
                    com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel r3 = com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel.this
                    com.forsale.app.utils.itemutils.ViewSpacing r3 = com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel.e(r3)
                    if (r3 != 0) goto L3b
                L35:
                    com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel r3 = com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel.this
                    com.forsale.app.utils.itemutils.ViewSpacing r3 = com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel.f(r3)
                L3b:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel$spacing$1.invoke(java.util.List):com.forsale.app.utils.itemutils.ViewSpacing");
            }
        });
        this.f30746x = Transformations.b(liveData, new l<List<b<?>>, Boolean>() { // from class: com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel$isContentVisible$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(List<b<?>> it2) {
                o.i(it2, "it");
                return Boolean.valueOf(!it2.isEmpty());
            }
        });
    }
}
