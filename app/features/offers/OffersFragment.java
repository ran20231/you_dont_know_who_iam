package com.forsale.app.features.offers;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import com.forsale.adserver.view.models.CommercialModel;
import com.forsale.adserver.view.screens.ui.OffersScreenKt;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.app.features.categories.listings.items.dfp.GamComposeKt;
import com.forsale.app.features.more.support.SupportActivity;
import com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.l;
import g00.p;
import j0.d1;
import j0.v0;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.q;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import t9.y0;
import wz.h;
import z3.i;
/* compiled from: OffersFragment.kt */
/* loaded from: classes2.dex */
public final class OffersFragment extends a {

    /* renamed from: f  reason: collision with root package name */
    private final i f33822f = new i(s.b(b.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.offers.OffersFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final Bundle invoke() {
            Bundle arguments = Fragment.this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
        }
    });

    /* renamed from: g  reason: collision with root package name */
    private final h f33823g;

    public OffersFragment() {
        h a11;
        a11 = d.a(new g00.a<CommercialModel>() { // from class: com.forsale.app.features.offers.OffersFragment$commercialModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CommercialModel invoke() {
                b x11;
                x11 = OffersFragment.this.x();
                String b11 = x11.b();
                if (b11 != null) {
                    return (CommercialModel) new com.google.gson.d().k(b11, CommercialModel.class);
                }
                return null;
            }
        });
        this.f33823g = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(final AdManagerAdRequest adManagerAdRequest, androidx.compose.runtime.a aVar, final int i11) {
        List e11;
        androidx.compose.runtime.a h11 = aVar.h(-1726142202);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1726142202, i11, -1, "com.forsale.app.features.offers.OffersFragment.GAMSection (OffersFragment.kt:85)");
        }
        if (adManagerAdRequest != null) {
            String string = getString(y0.f70613p);
            o.h(string, "getString(...)");
            e11 = q.e(new AdSize(320, 50));
            AdSize[] adSizeArr = (AdSize[]) e11.toArray(new AdSize[0]);
            GamComposeKt.a(string, (AdSize[]) Arrays.copyOf(adSizeArr, adSizeArr.length), adManagerAdRequest, false, PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, e2.h.l(16), 0.0f, 0.0f, 13, null), null, h11, 28224, 32);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.offers.OffersFragment$GAMSection$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    OffersFragment.this.q(adManagerAdRequest, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(169639783);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(169639783, i11, -1, "com.forsale.app.features.offers.OffersFragment.ScreenContent (OffersFragment.kt:64)");
        }
        OffersScreenKt.a(y(), x().a(), null, new g00.a<wz.p>() { // from class: com.forsale.app.features.offers.OffersFragment$ScreenContent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Context context = OffersFragment.this.getContext();
                if (context != null) {
                    SupportActivity.f32788x.a(context);
                }
            }
        }, r0.b.b(h11, 1948538041, true, new g00.q<AdManagerAdRequest, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.offers.OffersFragment$ScreenContent$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            public final void b(AdManagerAdRequest adManagerAdRequest, androidx.compose.runtime.a aVar2, int i12) {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1948538041, i12, -1, "com.forsale.app.features.offers.OffersFragment.ScreenContent.<anonymous> (OffersFragment.kt:66)");
                }
                OffersFragment.this.q(adManagerAdRequest, aVar2, 72);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ wz.p invoke(AdManagerAdRequest adManagerAdRequest, androidx.compose.runtime.a aVar2, Integer num) {
                b(adManagerAdRequest, aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), new l<CommercialPageSource, wz.p>() { // from class: com.forsale.app.features.offers.OffersFragment$ScreenContent$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CommercialPageSource commercialPageSource) {
                androidx.appcompat.app.d l11 = ContextExtensionsKt.l(OffersFragment.this.getContext());
                if (l11 != null) {
                    OffersFragment offersFragment = OffersFragment.this;
                    w wVar = w.f61809a;
                    String string = offersFragment.getString(y0.I2);
                    o.h(string, "getString(...)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{new com.google.gson.d().t(new CommercialModel(commercialPageSource, null, null, 6, null))}, 1));
                    o.h(format, "format(...)");
                    FCMTopLevelFunctionsKt.b(l11, Uri.parse(format).toString());
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(CommercialPageSource commercialPageSource) {
                b(commercialPageSource);
                return wz.p.f75480a;
            }
        }, h11, CommercialModel.f21063d | 24576, 4);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.offers.OffersFragment$ScreenContent$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    OffersFragment.this.r(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b x() {
        return (b) this.f33822f.getValue();
    }

    private final CommercialModel y() {
        return (CommercialModel) this.f33823g.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
        composeView.setContent(r0.b.c(-825475818, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.offers.OffersFragment$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(-825475818, i11, -1, "com.forsale.app.features.offers.OffersFragment.onCreateView.<anonymous>.<anonymous> (OffersFragment.kt:56)");
                }
                final OffersFragment offersFragment = OffersFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 602725407, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.offers.OffersFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(602725407, i12, -1, "com.forsale.app.features.offers.OffersFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (OffersFragment.kt:57)");
                        }
                        OffersFragment.this.r(aVar2, 8);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
        return composeView;
    }
}
