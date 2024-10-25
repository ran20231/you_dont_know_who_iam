package com.forsale.app.features.categories.home.propertyhome;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.s;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.CommercialModel;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.home.propertyhome.c;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.utils.ComposeLifeCycleUtilsKt;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.analytics.propertyhome.PropertySectionName;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import e2.h;
import falcon.chat.entities.Constants;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.u;
import j0.v0;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import okhttp3.internal.http2.Http2;
import p1.g;
import t9.p0;
import t9.q0;
import t9.y0;
import v0.b;
import wz.p;
import z3.n;
/* compiled from: PropertyHomeFragment.kt */
/* loaded from: classes2.dex */
public final class PropertyHomeFragment extends a {
    /* JADX INFO: Access modifiers changed from: private */
    public final void A(final boolean z11, final PropertyHomeViewModel propertyHomeViewModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(91762442);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(91762442, i11, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.Subcategories (PropertyHomeFragment.kt:170)");
        }
        SubCategoriesKt.a(z11, (SectionState) z.b(propertyHomeViewModel.v(), null, h11, 8, 1).getValue(), new l<CategoryEntity, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$Subcategories$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CategoryEntity it2) {
                o.i(it2, "it");
                PropertyHomeViewModel.this.s(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(CategoryEntity categoryEntity) {
                b(categoryEntity);
                return p.f75480a;
            }
        }, h11, i11 & 14);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$Subcategories$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PropertyHomeFragment.this.A(z11, propertyHomeViewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Integer num, String str) {
        if (num == null) {
            return;
        }
        androidx.navigation.fragment.a.a(this).d0(c.d.d(c.f24983a, ListingsTypes.HOT_ZONES, str, 0, null, null, null, num.intValue(), false, p0.f69712l, 0, null, null, 0, null, 15932, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(AdGeneralModel adGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a aVar) {
        Context context = getContext();
        if (context != null) {
            AdsModel s11 = AdGeneralModel.s(adGeneralModel, null, AdType.OFFER, null, null, 12, null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            CommercialItemDetailsSource commercialItemDetailsSource = CommercialItemDetailsSource.VERTICAL_PAGE;
            o.f(childFragmentManager);
            NewDetailsBottomSheetKt.f(context, s11, null, null, childFragmentManager, null, commercialItemDetailsSource, aVar, null, Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(CategoryEntity categoryEntity) {
        NavController a11 = androidx.navigation.fragment.a.a(this);
        w wVar = w.f61809a;
        String string = getString(y0.I2);
        o.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{new com.google.gson.d().t(new CommercialModel(CommercialPageSource.VERTICAL_PAGE, null, categoryEntity.getSystemName(), 2, null))}, 1));
        o.h(format, "format(...)");
        String uri = Uri.parse(format).toString();
        o.h(uri, "toString(...)");
        NavigationUtilsKt.a(a11, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0(xa.a aVar) {
        Context context = getContext();
        if (context != null) {
            ListingDetailsActivity.a aVar2 = ListingDetailsActivity.R;
            ListingItemBrief c11 = aVar.c();
            int id2 = aVar.c().getId();
            int g11 = aVar.g();
            String value = aVar.d().getValue();
            int e11 = aVar.e();
            int g12 = aVar.g();
            int f11 = aVar.f();
            aVar2.a(context, (r33 & 1) != 0 ? null : c11, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : id2, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : null, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : new ListingDetailsAnalyticSource.PropertyHomeAnalytics(value, Integer.valueOf(e11), Integer.valueOf(g12), null, Integer.valueOf(f11), aVar.d(), aVar.a(), aVar.b()), (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : true, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? g11 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(CategoryEntity categoryEntity) {
        n b11 = c.d.b(c.f24983a, categoryEntity, categoryEntity.getName(), new CategoryListingsAnalyticSource.SubCategoryPage(null, 1, null), null, null, null, null, null, false, 504, null);
        if (b11 != null) {
            androidx.navigation.fragment.a.a(this).d0(b11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(CategoryEntity categoryEntity) {
        androidx.navigation.fragment.a.a(this).d0(c.d.f(c.f24983a, categoryEntity, categoryEntity.getName(), null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(final PropertyHomeViewModel propertyHomeViewModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1087434008);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1087434008, i11, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.registerObservers (PropertyHomeFragment.kt:203)");
        }
        p pVar = p.f75480a;
        u.d(pVar, new PropertyHomeFragment$registerObservers$1(propertyHomeViewModel, this, null), h11, 70);
        u.d(pVar, new PropertyHomeFragment$registerObservers$2(propertyHomeViewModel, this, null), h11, 70);
        u.d(pVar, new PropertyHomeFragment$registerObservers$3(propertyHomeViewModel, this, null), h11, 70);
        ComposeLifeCycleUtilsKt.a(new g00.p<s, Lifecycle.Event, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$4

            /* compiled from: PropertyHomeFragment.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f24786a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f24786a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(s owner, Lifecycle.Event event) {
                o.i(owner, "owner");
                o.i(event, "event");
                int i12 = a.f24786a[event.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            PropertyHomeFragment.this.Y(propertyHomeViewModel);
                            return;
                        }
                        return;
                    }
                    PropertyHomeFragment.this.b0(propertyHomeViewModel);
                    return;
                }
                PropertyHomeFragment.this.c0(propertyHomeViewModel);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(s sVar, Lifecycle.Event event) {
                b(sVar, event);
                return p.f75480a;
            }
        }, h11, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PropertyHomeFragment.this.f0(propertyHomeViewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private final void g0(String str) {
        MainContainerActivity mainContainerActivity;
        androidx.appcompat.app.d l11 = ContextExtensionsKt.l(getActivity());
        if (l11 instanceof MainContainerActivity) {
            mainContainerActivity = (MainContainerActivity) l11;
        } else {
            mainContainerActivity = null;
        }
        if (mainContainerActivity != null) {
            mainContainerActivity.b2(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final boolean z11, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a aVar3;
        int i15;
        int i16;
        androidx.compose.runtime.a h11 = aVar2.h(-344152263);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-344152263, i12, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.ErrorState (PropertyHomeFragment.kt:137)");
            }
            if (z11) {
                h11.C(142168374);
                i13 = y0.X4;
            } else {
                h11.C(142168439);
                i13 = y0.Yd;
            }
            String b11 = g.b(i13, h11, 0);
            h11.S();
            if (z11) {
                h11.C(142168541);
                i14 = q0.C;
            } else {
                h11.C(142168596);
                i14 = q0.B;
            }
            Painter d11 = p1.e.d(i14, h11, 0);
            h11.S();
            Arrangement arrangement = Arrangement.f3698a;
            float f11 = 8;
            float l11 = h.l(f11);
            b.a aVar4 = v0.b.f74009a;
            Arrangement.m q11 = arrangement.q(l11, aVar4.i());
            b.InterfaceC0889b g11 = aVar4.g();
            h11.C(-483455358);
            c.a aVar5 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.e.a(q11, g11, h11, 54);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar5);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(h11);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            ImageKt.a(d11, "Error icon", null, null, null, 0.0f, null, h11, 56, 124);
            SpacerKt.a(SizeKt.i(aVar5, h.l(f11)), h11, 6);
            String b13 = g.b(y0.Y4, h11, 0);
            dk.a aVar6 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            TextKt.a(b13, null, 0, 0, false, 0, 0, null, aVar6.c(h11, i17).q(), 0L, 0, h11, 0, 0, 1790);
            TextKt.a(b11, null, 0, 0, false, 0, 0, null, aVar6.c(h11, i17).d(), 0L, 0, h11, 0, 0, 1790);
            aVar3 = h11;
            SpacerKt.a(SizeKt.i(aVar5, h.l(4)), aVar3, 6);
            aVar3.C(1157296644);
            boolean T = aVar3.T(aVar);
            Object D = aVar3.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$ErrorState$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        aVar.invoke();
                    }
                };
                aVar3.u(D);
            }
            aVar3.S();
            ButtonsKt.e((g00.a) D, null, ButtonData.f40994a.c(), false, false, null, ComposableSingletons$PropertyHomeFragmentKt.f24531a.b(), aVar3, (ButtonData.f40995b << 6) | 1572864, 58);
            aVar3.S();
            aVar3.w();
            aVar3.S();
            aVar3.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l12 = aVar3.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$ErrorState$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar7, int i18) {
                    PropertyHomeFragment.this.r(z11, aVar, aVar7, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar7, Integer num) {
                    b(aVar7, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(final boolean z11, final PropertyHomeViewModel propertyHomeViewModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-667958340);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-667958340, i11, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.ForSaleRealtyContainer (PropertyHomeFragment.kt:296)");
        }
        ForSaleRealtyKt.b(z11, (SectionState) z.b(propertyHomeViewModel.x(), null, h11, 8, 1).getValue(), new g00.p<Integer, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$ForSaleRealtyContainer$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(int i12, int i13) {
                PropertyHomeViewModel.c0(PropertyHomeViewModel.this, PropertySectionName.FOR_SALE_REALTY.getValue(), i12, i13, 0, null, 24, null);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(Integer num, Integer num2) {
                b(num.intValue(), num2.intValue());
                return p.f75480a;
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$ForSaleRealtyContainer$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                androidx.navigation.fragment.a.a(this).d0(c.d.d(c.f24983a, ListingsTypes.FOR_SALE_REALTY, null, 0, null, null, null, PropertyHomeViewModel.this.w().getId(), false, 0, 0, null, null, 0, null, 16318, null));
            }
        }, h11, i11 & 14, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$ForSaleRealtyContainer$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PropertyHomeFragment.this.s(z11, propertyHomeViewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(final boolean z11, final PropertyHomeViewModel propertyHomeViewModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(848562519);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(848562519, i11, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.PropertyServices (PropertyHomeFragment.kt:194)");
        }
        PropertyServicesKt.a(z11, (SectionState) z.b(propertyHomeViewModel.D(), null, h11, 8, 1).getValue(), new l<CategoryEntity, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$PropertyServices$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CategoryEntity it2) {
                o.i(it2, "it");
                PropertyHomeViewModel.this.s(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(CategoryEntity categoryEntity) {
                b(categoryEntity);
                return p.f75480a;
            }
        }, h11, i11 & 14);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$PropertyServices$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PropertyHomeFragment.this.t(z11, propertyHomeViewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(final boolean z11, final PropertyHomeViewModel propertyHomeViewModel, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(500837362);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(500837362, i11, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.RecommendedSectionsContainer (PropertyHomeFragment.kt:341)");
        }
        RecommendedSectionsKt.e(z11, (SectionState) z.b(propertyHomeViewModel.E(), null, h11, 8, 1).getValue(), new g00.r<Integer, Integer, Integer, Pair<? extends List<? extends String>, ? extends List<? extends String>>, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$RecommendedSectionsContainer$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(4);
            }

            public final void b(int i12, int i13, int i14, Pair<? extends List<String>, ? extends List<String>> filters) {
                o.i(filters, "filters");
                PropertyHomeViewModel.this.b0(PropertySectionName.RECOMMENDED_FILTERS.getValue(), i12, i13, i14, filters);
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ p d(Integer num, Integer num2, Integer num3, Pair<? extends List<? extends String>, ? extends List<? extends String>> pair) {
                b(num.intValue(), num2.intValue(), num3.intValue(), pair);
                return p.f75480a;
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$RecommendedSectionsContainer$2
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }
        }, h11, (i11 & 14) | 3072, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$RecommendedSectionsContainer$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PropertyHomeFragment.this.w(z11, propertyHomeViewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r19, androidx.compose.runtime.a r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.x(com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel, androidx.compose.runtime.a, int, int):void");
    }

    private static final SectionState y(n1<? extends SectionState> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    public final void Y(PropertyHomeViewModel viewModel) {
        o.i(viewModel, "viewModel");
        viewModel.N();
    }

    public final void b0(PropertyHomeViewModel viewModel) {
        o.i(viewModel, "viewModel");
        viewModel.O();
    }

    public final void c0(PropertyHomeViewModel viewModel) {
        o.i(viewModel, "viewModel");
        viewModel.Z();
        viewModel.a0();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(r0.b.c(1372101922, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1372101922, i11, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.onCreateView.<anonymous>.<anonymous> (PropertyHomeFragment.kt:71)");
                }
                final PropertyHomeFragment propertyHomeFragment = PropertyHomeFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, -1683998229, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1683998229, i12, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PropertyHomeFragment.kt:72)");
                        }
                        PropertyHomeFragment.this.x(null, aVar2, 0, 1);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return p.f75480a;
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        CrashlyticsUtilsKt.b("Property Home Screen", null, 2, null);
    }

    public final void q(final boolean z11, final CategoryEntity category, androidx.compose.runtime.a aVar, final int i11) {
        List e11;
        o.i(category, "category");
        androidx.compose.runtime.a h11 = aVar.h(-929743769);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-929743769, i11, -1, "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment.CommercialAds (PropertyHomeFragment.kt:180)");
        }
        e11 = kotlin.collections.q.e(Integer.valueOf(category.getId()));
        h11.C(1157296644);
        boolean T = h11.T(this);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new g00.p<AdGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$CommercialAds$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(AdGeneralModel ad2, com.forsale.adserver.view.screens.detailsScreen.a commercialAnalyticPayload) {
                    o.i(ad2, "ad");
                    o.i(commercialAnalyticPayload, "commercialAnalyticPayload");
                    PropertyHomeFragment.this.V(ad2, commercialAnalyticPayload);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(AdGeneralModel adGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a aVar2) {
                    b(adGeneralModel, aVar2);
                    return p.f75480a;
                }
            };
            h11.u(D);
        }
        h11.S();
        CommercialAdsKt.a(e11, (g00.p) D, z11, new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$CommercialAds$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                PropertyHomeFragment.this.X(category);
            }
        }, h11, (i11 << 6) & 896);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$CommercialAds$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PropertyHomeFragment.this.q(z11, category, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
