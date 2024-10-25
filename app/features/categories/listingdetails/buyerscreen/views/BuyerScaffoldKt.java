package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.fragment.app.FragmentManager;
import c0.g;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt;
import com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.t;
import com.forsale.app.features.categories.listingdetails.buyerscreen.utils.AnimatedVisibiltyWithFadeKt;
import com.forsale.app.features.categories.listingdetails.buyerscreen.utils.BuyerDetailsComponentTags;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.forsale.app.utils.ComposeLifeCycleUtilsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetValue;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.NavBarsKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.logging.type.LogSeverity;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import q1.n;
import q1.s;
import r.f0;
import r.y;
import t9.q0;
import v0.b;
import w.f;
import w.u;
import w.x;
import wz.p;
/* compiled from: BuyerScaffold.kt */
/* loaded from: classes2.dex */
public final class BuyerScaffoldKt {

    /* compiled from: BuyerScaffold.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26665a;

        static {
            int[] iArr = new int[FavouriteState.values().length];
            try {
                iArr[FavouriteState.IS_NOT_FAVOURITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FavouriteState.IS_FAVOURITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FavouriteState.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26665a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final t tVar, final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, final g00.a<p> aVar, final k0<gb.a> k0Var, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(327760400);
        if (c.I()) {
            c.U(327760400, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerNavBar (BuyerScaffold.kt:430)");
        }
        final n1 b11 = z.b(buyerListingDetailsScreenViewModel.p0(), null, h11, 8, 1);
        androidx.compose.ui.c f11 = ScrollKt.f(PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), 0.0f, h.l(6), 0.0f, h.l(4), 5, null), ScrollKt.c(0, h11, 0, 1), false, null, false, 14, null);
        h11.C(-483455358);
        a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(f11);
        if (!(h11.k() instanceof d)) {
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
        f fVar = f.f74891a;
        if (!(tVar instanceof t.c) && !(tVar instanceof t.b)) {
            h11.C(1479316889);
            NavBarsKt.a(null, r0.b.b(h11, -1459151684, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.a] */
                /* JADX WARN: Type inference failed for: r1v3 */
                public final void b(a aVar3, int i12) {
                    if ((i12 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-1459151684, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerNavBar.<anonymous>.<anonymous> (BuyerScaffold.kt:443)");
                    }
                    final g00.a<p> aVar4 = aVar;
                    aVar3.C(1157296644);
                    boolean T = aVar3.T(aVar4);
                    Object D = aVar3.D();
                    if (T || D == a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r12v1 'aVar4' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r12 & 11
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r11.i()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r11.L()
                            goto L61
                        L10:
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerNavBar.<anonymous>.<anonymous> (BuyerScaffold.kt:443)"
                            r2 = -1459151684(0xffffffffa9071cbc, float:-3.0000945E-14)
                            androidx.compose.runtime.c.U(r2, r12, r0, r1)
                        L1f:
                            g00.a<wz.p> r12 = r1
                            r0 = 1157296644(0x44faf204, float:2007.563)
                            r11.C(r0)
                            boolean r0 = r11.T(r12)
                            java.lang.Object r1 = r11.D()
                            if (r0 != 0) goto L39
                            androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r0 = r0.a()
                            if (r1 != r0) goto L41
                        L39:
                            com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$1$1$1 r1 = new com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$1$1$1
                            r1.<init>(r12)
                            r11.u(r1)
                        L41:
                            r11.S()
                            r2 = r1
                            g00.a r2 = (g00.a) r2
                            r3 = 0
                            r4 = 0
                            r5 = 0
                            com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$BuyerScaffoldKt r12 = com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$BuyerScaffoldKt.f26867a
                            g00.p r6 = r12.a()
                            r8 = 24576(0x6000, float:3.4438E-41)
                            r9 = 14
                            r7 = r11
                            androidx.compose.material.IconButtonKt.a(r2, r3, r4, r5, r6, r7, r8, r9)
                            boolean r11 = androidx.compose.runtime.c.I()
                            if (r11 == 0) goto L61
                            androidx.compose.runtime.c.T()
                        L61:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), r0.b.b(h11, 971598781, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar3, int i12) {
                        if ((i12 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(971598781, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerNavBar.<anonymous>.<anonymous> (BuyerScaffold.kt:456)");
                        }
                        boolean c12 = k0Var.getValue().c();
                        y m11 = f0.m();
                        final k0<gb.a> k0Var2 = k0Var;
                        AnimatedVisibiltyWithFadeKt.a(c12, LogSeverity.ERROR_VALUE, m11, r0.b.b(aVar3, 2096106782, true, new q<q.c, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            public final void b(q.c AnimatedVisibiltyWithFade, a aVar4, int i13) {
                                k0<gb.a> k0Var3;
                                c.a aVar5;
                                o.i(AnimatedVisibiltyWithFade, "$this$AnimatedVisibiltyWithFade");
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(2096106782, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerNavBar.<anonymous>.<anonymous>.<anonymous> (BuyerScaffold.kt:461)");
                                }
                                c.a aVar6 = androidx.compose.ui.c.f7566a;
                                androidx.compose.ui.c k11 = PaddingKt.k(aVar6, h.l(4), 0.0f, 2, null);
                                k0<gb.a> k0Var4 = k0Var2;
                                aVar4.C(-483455358);
                                a0 a15 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), aVar4, 0);
                                aVar4.C(-1323940314);
                                int a16 = j0.e.a(aVar4, 0);
                                k s12 = aVar4.s();
                                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                                g00.a<ComposeUiNode> a17 = companion2.a();
                                q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(k11);
                                if (!(aVar4.k() instanceof d)) {
                                    j0.e.c();
                                }
                                aVar4.I();
                                if (aVar4.f()) {
                                    aVar4.y(a17);
                                } else {
                                    aVar4.t();
                                }
                                a a18 = Updater.a(aVar4);
                                Updater.c(a18, a15, companion2.e());
                                Updater.c(a18, s12, companion2.g());
                                g00.p<ComposeUiNode, Integer, p> b13 = companion2.b();
                                if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                                    a18.u(Integer.valueOf(a16));
                                    a18.p(Integer.valueOf(a16), b13);
                                }
                                c13.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                                aVar4.C(2058660585);
                                f fVar2 = f.f74891a;
                                String b14 = k0Var4.getValue().b();
                                aVar4.C(498008428);
                                if (b14 == null) {
                                    k0Var3 = k0Var4;
                                    aVar5 = aVar6;
                                } else {
                                    dk.a aVar7 = dk.a.f54291a;
                                    int i14 = dk.a.f54292b;
                                    k0Var3 = k0Var4;
                                    aVar5 = aVar6;
                                    TextKt.a(b14, TestTagKt.a(aVar6, BuyerDetailsComponentTags.NAV_TITLE.getTag()), 0, 0, false, 0, 0, null, aVar7.c(aVar4, i14).a(), aVar7.a(aVar4, i14).e().m(aVar4, yj.d.f76453b), 0, aVar4, 48, 0, 1276);
                                }
                                aVar4.S();
                                String a19 = k0Var3.getValue().a();
                                aVar4.C(172329529);
                                if (a19 != null) {
                                    dk.a aVar8 = dk.a.f54291a;
                                    int i15 = dk.a.f54292b;
                                    TextKt.a(a19, TestTagKt.a(aVar5, BuyerDetailsComponentTags.NAV_PRICE.getTag()), 0, 0, false, 0, 0, null, aVar8.c(aVar4, i15).l(), aVar8.a(aVar4, i15).f().i(aVar4, yj.d.f76453b), 0, aVar4, 48, 0, 1276);
                                }
                                aVar4.S();
                                aVar4.S();
                                aVar4.w();
                                aVar4.S();
                                aVar4.S();
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.q
                            public /* bridge */ /* synthetic */ p invoke(q.c cVar, a aVar4, Integer num) {
                                b(cVar, aVar4, num.intValue());
                                return p.f75480a;
                            }
                        }), aVar3, 3120);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), r0.b.b(h11, 1940180582, true, new q<w.t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    public final void b(w.t NavBarInner, a aVar3, int i12) {
                        FavouriteState b13;
                        boolean z11;
                        o.i(NavBarInner, "$this$NavBarInner");
                        if ((i12 & 81) == 16 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1940180582, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerNavBar.<anonymous>.<anonymous> (BuyerScaffold.kt:485)");
                        }
                        c.a aVar4 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.c a15 = TestTagKt.a(aVar4, BuyerDetailsComponentTags.LISTING_DETAILS_NAVBAR_FAVOURITE_ICON.getTag());
                        b13 = BuyerScaffoldKt.b(b11);
                        if (b13 != FavouriteState.PENDING) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel2 = buyerListingDetailsScreenViewModel;
                        g00.a<p> aVar5 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$3.1
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
                                BuyerListingDetailsScreenViewModel.this.P0();
                            }
                        };
                        final n1<FavouriteState> n1Var = b11;
                        IconButtonKt.a(aVar5, a15, z11, null, r0.b.b(aVar3, -1517949366, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$3.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void b(a aVar6, int i13) {
                                FavouriteState b14;
                                int p11;
                                FavouriteState b15;
                                long m11;
                                if ((i13 & 11) == 2 && aVar6.i()) {
                                    aVar6.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(-1517949366, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerNavBar.<anonymous>.<anonymous>.<anonymous> (BuyerScaffold.kt:489)");
                                }
                                b14 = BuyerScaffoldKt.b(n1Var);
                                p11 = BuyerScaffoldKt.p(b14, aVar6, 0);
                                Painter d11 = p1.e.d(p11, aVar6, 0);
                                b15 = BuyerScaffoldKt.b(n1Var);
                                if (b15 == FavouriteState.IS_FAVOURITE) {
                                    aVar6.C(172330594);
                                    m11 = dk.a.f54291a.a(aVar6, dk.a.f54292b).d().i(aVar6, yj.d.f76453b);
                                    aVar6.S();
                                } else {
                                    aVar6.C(172330710);
                                    m11 = dk.a.f54291a.a(aVar6, dk.a.f54292b).e().m(aVar6, yj.d.f76453b);
                                    aVar6.S();
                                }
                                IconKt.a(d11, null, null, m11, false, 0.0f, aVar6, 8, 54);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                                b(aVar6, num.intValue());
                                return p.f75480a;
                            }
                        }), aVar3, 24624, 8);
                        androidx.compose.ui.c a16 = TestTagKt.a(aVar4, BuyerDetailsComponentTags.LISTING_DETAILS_NAVBAR_SHARE_ICON.getTag());
                        final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel3 = buyerListingDetailsScreenViewModel;
                        IconButtonKt.a(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$1$3.3
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
                                BuyerListingDetailsScreenViewModel.this.T0();
                            }
                        }, a16, false, null, ComposableSingletons$BuyerScaffoldKt.f26867a.b(), aVar3, 24624, 12);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(w.t tVar2, a aVar3, Integer num) {
                        b(tVar2, aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), false, h11, 28080, 1);
                h11.S();
            } else {
                h11.C(1479316832);
                f(aVar, h11, (i11 >> 6) & 14);
                h11.S();
            }
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerNavBar$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar3, int i12) {
                        BuyerScaffoldKt.a(t.this, buyerListingDetailsScreenViewModel, aVar, k0Var, aVar3, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final FavouriteState b(n1<? extends FavouriteState> n1Var) {
            return n1Var.getValue();
        }

        public static final void c(final BuyerListingDetailsScreenViewModel viewModel, final FragmentManager fragmentManager, final g00.a<p> onBackPressedCallBack, final com.forsale.app.features.auth.e authenticatorDelegator, final q<? super MediaTypes.Images, ? super DetailsModel, ? super ShareText, p> onImageClicked, final l<? super String, p> onVideoClicked, final q<? super MediaTypes.ThreeDTour, ? super DetailsModel, ? super ShareText, p> onVirtualTourClicked, final l<? super UserProfileData, p> openSellerDetailsActivity, final l<? super DetailsModel, p> openChatActivity, final l<? super com.forsale.app.ui.bottomsheets.listingdetailschat.b, p> openChatSheet, final g00.a<p> onAppUpdate, final q<? super Integer, ? super ListingItemBrief, ? super List<Integer>, p> openNewListingDetailsFromRecommendedList, final g00.a<p> onRefreshGeneralError, final l<? super cb.a, p> onBreadCrumbsClicked, final q<? super MediaTypes, ? super DetailsModel, ? super ShareText, p> onAttributeFileClicked, final l<? super cb.a, p> onSimilarAdsSeeAllClicked, final g00.a<p> onRecentlyViewedSeeAllClicked, final r<? super LatLng, ? super Boolean, ? super DetailsModel, ? super ShareText, p> onMapClicked, final l<? super Integer, p> onPageChange, final PagerState pagerState, androidx.compose.runtime.a aVar, final int i11, final int i12) {
            o.i(viewModel, "viewModel");
            o.i(fragmentManager, "fragmentManager");
            o.i(onBackPressedCallBack, "onBackPressedCallBack");
            o.i(authenticatorDelegator, "authenticatorDelegator");
            o.i(onImageClicked, "onImageClicked");
            o.i(onVideoClicked, "onVideoClicked");
            o.i(onVirtualTourClicked, "onVirtualTourClicked");
            o.i(openSellerDetailsActivity, "openSellerDetailsActivity");
            o.i(openChatActivity, "openChatActivity");
            o.i(openChatSheet, "openChatSheet");
            o.i(onAppUpdate, "onAppUpdate");
            o.i(openNewListingDetailsFromRecommendedList, "openNewListingDetailsFromRecommendedList");
            o.i(onRefreshGeneralError, "onRefreshGeneralError");
            o.i(onBreadCrumbsClicked, "onBreadCrumbsClicked");
            o.i(onAttributeFileClicked, "onAttributeFileClicked");
            o.i(onSimilarAdsSeeAllClicked, "onSimilarAdsSeeAllClicked");
            o.i(onRecentlyViewedSeeAllClicked, "onRecentlyViewedSeeAllClicked");
            o.i(onMapClicked, "onMapClicked");
            o.i(onPageChange, "onPageChange");
            o.i(pagerState, "pagerState");
            androidx.compose.runtime.a h11 = aVar.h(2127038556);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(2127038556, i11, i12, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffold (BuyerScaffold.kt:115)");
            }
            g(pagerState, viewModel, onPageChange, h11, ((i12 >> 27) & 14) | 64 | ((i12 >> 18) & 896));
            ComposeLifeCycleUtilsKt.b(null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    BuyerListingDetailsScreenViewModel.this.k1(false);
                }
            }, null, null, h11, 0, 13);
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = c0.e(new gb.a(false, null, null, 6, null), null, 2, null);
                h11.u(D);
            }
            h11.S();
            final k0 k0Var = (k0) D;
            r(viewModel, fragmentManager, h11, 72);
            int i13 = i11 >> 6;
            int i14 = i11 >> 18;
            h(viewModel, authenticatorDelegator, openChatActivity, openChatSheet, onAppUpdate, openSellerDetailsActivity, openNewListingDetailsFromRecommendedList, h11, (i13 & 458752) | (i13 & 112) | 8 | (i14 & 896) | (i14 & 7168) | ((i12 << 12) & 57344) | ((i12 << 15) & 3670016));
            ScaffoldKt.b(n.c(androidx.compose.ui.c.f7566a, false, new l<s, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$2
                public final void b(s semantics) {
                    o.i(semantics, "$this$semantics");
                    q1.r.a(semantics, true);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(s sVar) {
                    b(sVar);
                    return p.f75480a;
                }
            }, 1, null), ScaffoldKt.l(null, null, h11, 0, 3), r0.b.b(h11, 1429200801, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v2 */
                /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.runtime.a] */
                public final void b(a aVar2, int i15) {
                    if ((i15 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1429200801, i15, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffold.<anonymous> (BuyerScaffold.kt:148)");
                    }
                    t tVar = (t) z.b(BuyerListingDetailsScreenViewModel.this.k0(), null, aVar2, 8, 1).getValue();
                    BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = BuyerListingDetailsScreenViewModel.this;
                    final g00.a<p> aVar3 = onBackPressedCallBack;
                    aVar2.C(1157296644);
                    boolean T = aVar2.T(aVar3);
                    Object D2 = aVar2.D();
                    if (T || D2 == a.f7182a.a()) {
                        D2 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: CONSTRUCTOR  (r3v1 'D2' java.lang.Object) = (r8v5 'aVar3' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$3$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$3.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$3$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r8 & 11
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r7.i()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r7.L()
                            goto L6f
                        L10:
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffold.<anonymous> (BuyerScaffold.kt:148)"
                            r2 = 1429200801(0x552fdfa1, float:1.20859384E13)
                            androidx.compose.runtime.c.U(r2, r8, r0, r1)
                        L1f:
                            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r8 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.this
                            kotlinx.coroutines.flow.StateFlow r8 = r8.k0()
                            r0 = 8
                            r1 = 1
                            r2 = 0
                            j0.n1 r8 = androidx.compose.runtime.z.b(r8, r2, r7, r0, r1)
                            java.lang.Object r8 = r8.getValue()
                            r0 = r8
                            com.forsale.app.features.categories.listingdetails.buyerscreen.t r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.t) r0
                            com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel r1 = com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel.this
                            g00.a<wz.p> r8 = r2
                            r2 = 1157296644(0x44faf204, float:2007.563)
                            r7.C(r2)
                            boolean r2 = r7.T(r8)
                            java.lang.Object r3 = r7.D()
                            if (r2 != 0) goto L50
                            androidx.compose.runtime.a$a r2 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r2 = r2.a()
                            if (r3 != r2) goto L58
                        L50:
                            com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$3$1$1 r3 = new com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$3$1$1
                            r3.<init>(r8)
                            r7.u(r3)
                        L58:
                            r7.S()
                            r2 = r3
                            g00.a r2 = (g00.a) r2
                            j0.k0<gb.a> r3 = r4
                            r5 = 3136(0xc40, float:4.394E-42)
                            r4 = r7
                            com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt.i(r0, r1, r2, r3, r4, r5)
                            boolean r7 = androidx.compose.runtime.c.I()
                            if (r7 == 0) goto L6f
                            androidx.compose.runtime.c.T()
                        L6f:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$3.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, r0.b.b(h11, -415029222, true, new q<w.o, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v11 */
                    /* JADX WARN: Type inference failed for: r10v14 */
                    /* JADX WARN: Type inference failed for: r10v8 */
                    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r8v5 */
                    public final void b(w.o padding, a aVar2, int i15) {
                        int i16;
                        int i17;
                        o.i(padding, "padding");
                        if ((i15 & 14) == 0) {
                            if (aVar2.T(padding)) {
                                i17 = 4;
                            } else {
                                i17 = 2;
                            }
                            i16 = i17 | i15;
                        } else {
                            i16 = i15;
                        }
                        if ((i16 & 91) == 18 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-415029222, i15, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffold.<anonymous> (BuyerScaffold.kt:158)");
                        }
                        androidx.compose.ui.c d11 = WindowInsetsPaddingKt.d(WindowInsetsPaddingKt.a(PaddingKt.h(SizeKt.f(androidx.compose.ui.c.f7566a, 0.0f, 1, null), padding), padding), x.h(androidx.compose.foundation.layout.s.b(androidx.compose.foundation.layout.r.f3992a, aVar2, 8), w.y.f74929a.f()));
                        BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = BuyerListingDetailsScreenViewModel.this;
                        final q<MediaTypes.Images, DetailsModel, ShareText, p> qVar = onImageClicked;
                        final l<String, p> lVar = onVideoClicked;
                        final q<MediaTypes.ThreeDTour, DetailsModel, ShareText, p> qVar2 = onVirtualTourClicked;
                        g00.a<p> aVar3 = onRefreshGeneralError;
                        l<cb.a, p> lVar2 = onBreadCrumbsClicked;
                        l<cb.a, p> lVar3 = onSimilarAdsSeeAllClicked;
                        g00.a<p> aVar4 = onRecentlyViewedSeeAllClicked;
                        final k0<gb.a> k0Var2 = k0Var;
                        final q<MediaTypes, DetailsModel, ShareText, p> qVar3 = onAttributeFileClicked;
                        int i18 = i12;
                        final r<LatLng, Boolean, DetailsModel, ShareText, p> rVar = onMapClicked;
                        aVar2.C(693286680);
                        a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), b.f74009a.l(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(d11);
                        if (!(aVar2.k() instanceof d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        u uVar = u.f74924a;
                        t tVar = (t) z.b(buyerListingDetailsScreenViewModel.k0(), null, aVar2, 8, 1).getValue();
                        aVar2.C(1157296644);
                        boolean T = aVar2.T(qVar);
                        Object D2 = aVar2.D();
                        if (T || D2 == a.f7182a.a()) {
                            D2 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0149: CONSTRUCTOR  (r10v7 'D2' java.lang.Object) = 
                                  (r6v2 'qVar' g00.q<com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes$Images, com.forsale.app.features.categories.listingdetails.models.DetailsModel, com.forsale.app.features.categories.listingdetails.ShareText, wz.p> A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$4$1$1$1.<init>(g00.q):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$4.b(w.o, androidx.compose.runtime.a, int):void, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$4$1$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                Method dump skipped, instructions count: 580
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$4.b(w.o, androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ p invoke(w.o oVar, a aVar2, Integer num) {
                            b(oVar, aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), h11, 384, 12582912, 131064);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                    d1 l11 = h11.l();
                    if (l11 == null) {
                        return;
                    }
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$BuyerScaffold$5
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar2, int i15) {
                            BuyerScaffoldKt.c(BuyerListingDetailsScreenViewModel.this, fragmentManager, onBackPressedCallBack, authenticatorDelegator, onImageClicked, onVideoClicked, onVirtualTourClicked, openSellerDetailsActivity, openChatActivity, openChatSheet, onAppUpdate, openNewListingDetailsFromRecommendedList, onRefreshGeneralError, onBreadCrumbsClicked, onAttributeFileClicked, onSimilarAdsSeeAllClicked, onRecentlyViewedSeeAllClicked, onMapClicked, onPageChange, pagerState, aVar2, v0.a(i11 | 1), v0.a(i12));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }

                public static final void d(final BuyerListingDetailsScreenViewModel viewModel, androidx.compose.runtime.a aVar, final int i11) {
                    o.i(viewModel, "viewModel");
                    androidx.compose.runtime.a h11 = aVar.h(792596312);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(792596312, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.CTABottomSheet (BuyerScaffold.kt:215)");
                    }
                    n1 b11 = z.b(viewModel.o0(), null, h11, 8, 1);
                    ab.a e11 = e(b11);
                    x10.a.b("CTAsBottomSheet:: " + e11, new Object[0]);
                    ModalBottomSheetState k11 = BottomSheetsKt.k(ModalBottomSheetValue.Hidden, null, true, null, h11, 390, 10);
                    final ab.a e12 = e(b11);
                    if (e12 != null) {
                        j0.u.d(Boolean.valueOf(e(b11).c()), new BuyerScaffoldKt$CTABottomSheet$1$1(e12, k11, null), h11, 64);
                        ShowCTAsBottomSheetKt.b(k11, e12, r0.b.b(h11, -716625776, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$CTABottomSheet$1$2

                            /* compiled from: BuyerScaffold.kt */
                            /* loaded from: classes2.dex */
                            public /* synthetic */ class a {

                                /* renamed from: a  reason: collision with root package name */
                                public static final /* synthetic */ int[] f26608a;

                                static {
                                    int[] iArr = new int[UserContactMode.values().length];
                                    try {
                                        iArr[UserContactMode.CALL_ONLY.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[UserContactMode.WHATSAPP_ONLY.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    f26608a = iArr;
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                if ((i12 & 11) == 2 && aVar2.i()) {
                                    aVar2.L();
                                    return;
                                }
                                int i13 = -1;
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(-716625776, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.CTABottomSheet.<anonymous>.<anonymous> (BuyerScaffold.kt:233)");
                                }
                                UserContactMode a11 = ab.a.this.a();
                                if (a11 != null) {
                                    i13 = a.f26608a[a11.ordinal()];
                                }
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        aVar2.C(-97651865);
                                        aVar2.S();
                                    } else {
                                        aVar2.C(-97652665);
                                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                                        float f11 = 40;
                                        androidx.compose.ui.c a12 = y0.e.a(SizeKt.i(SizeKt.u(aVar3, h.l(f11)), h.l(f11)), g.f());
                                        dk.a aVar4 = dk.a.f54291a;
                                        int i14 = dk.a.f54292b;
                                        yj.d h12 = aVar4.a(aVar2, i14).h();
                                        int i15 = yj.d.f76453b;
                                        androidx.compose.ui.c b12 = BackgroundKt.b(a12, h12.h(aVar2, i15), null, 2, null);
                                        aVar2.C(733328855);
                                        b.a aVar5 = b.f74009a;
                                        a0 g11 = BoxKt.g(aVar5.o(), false, aVar2, 0);
                                        aVar2.C(-1323940314);
                                        int a13 = j0.e.a(aVar2, 0);
                                        k s11 = aVar2.s();
                                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                                        g00.a<ComposeUiNode> a14 = companion.a();
                                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b12);
                                        if (!(aVar2.k() instanceof d)) {
                                            j0.e.c();
                                        }
                                        aVar2.I();
                                        if (aVar2.f()) {
                                            aVar2.y(a14);
                                        } else {
                                            aVar2.t();
                                        }
                                        androidx.compose.runtime.a a15 = Updater.a(aVar2);
                                        Updater.c(a15, g11, companion.e());
                                        Updater.c(a15, s11, companion.g());
                                        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
                                        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                                            a15.u(Integer.valueOf(a13));
                                            a15.p(Integer.valueOf(a13), b13);
                                        }
                                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                                        aVar2.C(2058660585);
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                                        IconKt.a(p1.e.d(sj.d.O, aVar2, 0), boxScopeInstance.e(aVar3, aVar5.e()), null, aVar4.a(aVar2, i14).h().j(aVar2, i15), false, h.l(20), aVar2, 196616, 20);
                                        aVar2.S();
                                        aVar2.w();
                                        aVar2.S();
                                        aVar2.S();
                                        aVar2.S();
                                    }
                                } else {
                                    aVar2.C(-97653486);
                                    c.a aVar6 = androidx.compose.ui.c.f7566a;
                                    float f12 = 40;
                                    androidx.compose.ui.c a16 = y0.e.a(SizeKt.i(SizeKt.u(aVar6, h.l(f12)), h.l(f12)), g.f());
                                    dk.a aVar7 = dk.a.f54291a;
                                    int i16 = dk.a.f54292b;
                                    yj.d f13 = aVar7.a(aVar2, i16).f();
                                    int i17 = yj.d.f76453b;
                                    androidx.compose.ui.c b14 = BackgroundKt.b(a16, f13.h(aVar2, i17), null, 2, null);
                                    aVar2.C(733328855);
                                    b.a aVar8 = b.f74009a;
                                    a0 g12 = BoxKt.g(aVar8.o(), false, aVar2, 0);
                                    aVar2.C(-1323940314);
                                    int a17 = j0.e.a(aVar2, 0);
                                    k s12 = aVar2.s();
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                                    g00.a<ComposeUiNode> a18 = companion2.a();
                                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(b14);
                                    if (!(aVar2.k() instanceof d)) {
                                        j0.e.c();
                                    }
                                    aVar2.I();
                                    if (aVar2.f()) {
                                        aVar2.y(a18);
                                    } else {
                                        aVar2.t();
                                    }
                                    androidx.compose.runtime.a a19 = Updater.a(aVar2);
                                    Updater.c(a19, g12, companion2.e());
                                    Updater.c(a19, s12, companion2.g());
                                    g00.p<ComposeUiNode, Integer, p> b15 = companion2.b();
                                    if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                                        a19.u(Integer.valueOf(a17));
                                        a19.p(Integer.valueOf(a17), b15);
                                    }
                                    c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                                    aVar2.C(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f3756a;
                                    IconKt.a(p1.e.d(sj.d.f68678o, aVar2, 0), boxScopeInstance2.e(aVar6, aVar8.e()), null, aVar7.a(aVar2, i16).f().j(aVar2, i17), false, h.l(20), aVar2, 196616, 20);
                                    aVar2.S();
                                    aVar2.w();
                                    aVar2.S();
                                    aVar2.S();
                                    aVar2.S();
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return p.f75480a;
                            }
                        }), new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$CTABottomSheet$1$3

                            /* compiled from: BuyerScaffold.kt */
                            /* loaded from: classes2.dex */
                            public /* synthetic */ class a {

                                /* renamed from: a  reason: collision with root package name */
                                public static final /* synthetic */ int[] f26611a;

                                static {
                                    int[] iArr = new int[UserContactMode.values().length];
                                    try {
                                        iArr[UserContactMode.CALL_ONLY.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[UserContactMode.WHATSAPP_ONLY.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    f26611a = iArr;
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(String specificNumber) {
                                int i12;
                                o.i(specificNumber, "specificNumber");
                                UserContactMode a11 = ab.a.this.a();
                                if (a11 == null) {
                                    i12 = -1;
                                } else {
                                    i12 = a.f26611a[a11.ordinal()];
                                }
                                if (i12 != 1) {
                                    if (i12 == 2) {
                                        viewModel.V0(specificNumber);
                                        return;
                                    }
                                    return;
                                }
                                viewModel.M0(specificNumber);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(String str) {
                                b(str);
                                return p.f75480a;
                            }
                        }, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$CTABottomSheet$1$4
                            /* JADX INFO: Access modifiers changed from: package-private */
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
                                BuyerListingDetailsScreenViewModel.this.f0();
                            }
                        }, h11, 448);
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                    d1 l11 = h11.l();
                    if (l11 != null) {
                        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$CTABottomSheet$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(a aVar2, int i12) {
                                BuyerScaffoldKt.d(BuyerListingDetailsScreenViewModel.this, aVar2, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }

                private static final ab.a e(n1<ab.a> n1Var) {
                    return n1Var.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void f(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
                    final int i12;
                    int i13;
                    androidx.compose.runtime.a h11 = aVar2.h(902145108);
                    if ((i11 & 14) == 0) {
                        if (h11.F(aVar)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        i12 = i13 | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 11) == 2 && h11.i()) {
                        h11.L();
                    } else {
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(902145108, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.NavBarForErrorScreen (BuyerScaffold.kt:511)");
                        }
                        NavBarsKt.a(null, r0.b.b(h11, -1642532390, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.a] */
                            /* JADX WARN: Type inference failed for: r1v3 */
                            public final void b(a aVar3, int i14) {
                                if ((i14 & 11) == 2 && aVar3.i()) {
                                    aVar3.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(-1642532390, i14, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.NavBarForErrorScreen.<anonymous> (BuyerScaffold.kt:513)");
                                }
                                final g00.a<p> aVar4 = aVar;
                                aVar3.C(1157296644);
                                boolean T = aVar3.T(aVar4);
                                Object D = aVar3.D();
                                if (T || D == a.f7182a.a()) {
                                    D = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r12v1 'aVar4' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$1$1$1, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                        	... 25 more
                                        */
                                    /*
                                        this = this;
                                        r0 = r12 & 11
                                        r1 = 2
                                        if (r0 != r1) goto L10
                                        boolean r0 = r11.i()
                                        if (r0 != 0) goto Lc
                                        goto L10
                                    Lc:
                                        r11.L()
                                        goto L61
                                    L10:
                                        boolean r0 = androidx.compose.runtime.c.I()
                                        if (r0 == 0) goto L1f
                                        r0 = -1
                                        java.lang.String r1 = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.NavBarForErrorScreen.<anonymous> (BuyerScaffold.kt:513)"
                                        r2 = -1642532390(0xffffffff9e18f1da, float:-8.096827E-21)
                                        androidx.compose.runtime.c.U(r2, r12, r0, r1)
                                    L1f:
                                        g00.a<wz.p> r12 = r1
                                        r0 = 1157296644(0x44faf204, float:2007.563)
                                        r11.C(r0)
                                        boolean r0 = r11.T(r12)
                                        java.lang.Object r1 = r11.D()
                                        if (r0 != 0) goto L39
                                        androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                                        java.lang.Object r0 = r0.a()
                                        if (r1 != r0) goto L41
                                    L39:
                                        com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$1$1$1 r1 = new com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$1$1$1
                                        r1.<init>(r12)
                                        r11.u(r1)
                                    L41:
                                        r11.S()
                                        r2 = r1
                                        g00.a r2 = (g00.a) r2
                                        r3 = 0
                                        r4 = 0
                                        r5 = 0
                                        com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$BuyerScaffoldKt r12 = com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$BuyerScaffoldKt.f26867a
                                        g00.p r6 = r12.c()
                                        r8 = 24576(0x6000, float:3.4438E-41)
                                        r9 = 14
                                        r7 = r11
                                        androidx.compose.material.IconButtonKt.a(r2, r3, r4, r5, r6, r7, r8, r9)
                                        boolean r11 = androidx.compose.runtime.c.I()
                                        if (r11 == 0) goto L61
                                        androidx.compose.runtime.c.T()
                                    L61:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$1.b(androidx.compose.runtime.a, int):void");
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                                    b(aVar3, num.intValue());
                                    return p.f75480a;
                                }
                            }), null, null, false, h11, 48, 29);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }
                        d1 l11 = h11.l();
                        if (l11 != null) {
                            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$NavBarForErrorScreen$2
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(a aVar3, int i14) {
                                    BuyerScaffoldKt.f(aVar, aVar3, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                                    b(aVar3, num.intValue());
                                    return p.f75480a;
                                }
                            });
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void g(final PagerState pagerState, final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, final l<? super Integer, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
                        androidx.compose.runtime.a h11 = aVar.h(1751559535);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1751559535, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.OnSwiping (BuyerScaffold.kt:203)");
                        }
                        j0.u.d(p.f75480a, new BuyerScaffoldKt$OnSwiping$1(pagerState, buyerListingDetailsScreenViewModel, lVar, null), h11, 70);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        d1 l11 = h11.l();
                        if (l11 != null) {
                            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$OnSwiping$2
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void b(a aVar2, int i12) {
                                    BuyerScaffoldKt.g(PagerState.this, buyerListingDetailsScreenViewModel, lVar, aVar2, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                                    b(aVar2, num.intValue());
                                    return p.f75480a;
                                }
                            });
                        }
                    }

                    public static final void h(final BuyerListingDetailsScreenViewModel viewModel, final com.forsale.app.features.auth.e authenticatorDelegator, final l<? super DetailsModel, p> openChatActivity, final l<? super com.forsale.app.ui.bottomsheets.listingdetailschat.b, p> openChatSheet, final g00.a<p> onAppUpdate, final l<? super UserProfileData, p> openSellerDetailsActivity, final q<? super Integer, ? super ListingItemBrief, ? super List<Integer>, p> openNewListingDetailsFromRecommendedList, androidx.compose.runtime.a aVar, final int i11) {
                        o.i(viewModel, "viewModel");
                        o.i(authenticatorDelegator, "authenticatorDelegator");
                        o.i(openChatActivity, "openChatActivity");
                        o.i(openChatSheet, "openChatSheet");
                        o.i(onAppUpdate, "onAppUpdate");
                        o.i(openSellerDetailsActivity, "openSellerDetailsActivity");
                        o.i(openNewListingDetailsFromRecommendedList, "openNewListingDetailsFromRecommendedList");
                        androidx.compose.runtime.a h11 = aVar.h(-560451147);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-560451147, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.RenderBuyerScreenEvents (BuyerScaffold.kt:296)");
                        }
                        j0.u.d(p.f75480a, new BuyerScaffoldKt$RenderBuyerScreenEvents$1(viewModel, authenticatorDelegator, onAppUpdate, openSellerDetailsActivity, openNewListingDetailsFromRecommendedList, (Context) h11.q(AndroidCompositionLocals_androidKt.g()), openChatActivity, openChatSheet, null), h11, 70);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        d1 l11 = h11.l();
                        if (l11 != null) {
                            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$RenderBuyerScreenEvents$2
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void b(a aVar2, int i12) {
                                    BuyerScaffoldKt.h(BuyerListingDetailsScreenViewModel.this, authenticatorDelegator, openChatActivity, openChatSheet, onAppUpdate, openSellerDetailsActivity, openNewListingDetailsFromRecommendedList, aVar2, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                                    b(aVar2, num.intValue());
                                    return p.f75480a;
                                }
                            });
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int p(FavouriteState favouriteState, androidx.compose.runtime.a aVar, int i11) {
                        aVar.C(716612448);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(716612448, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.getIconByFavState (BuyerScaffold.kt:529)");
                        }
                        int i12 = a.f26665a[favouriteState.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 == 3) {
                                    int i13 = q0.D0;
                                    if (androidx.compose.runtime.c.I()) {
                                        androidx.compose.runtime.c.T();
                                    }
                                    aVar.S();
                                    return i13;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            int i14 = q0.E0;
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                            aVar.S();
                            return i14;
                        }
                        int i15 = q0.D0;
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        aVar.S();
                        return i15;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void q(com.forsale.app.features.auth.e eVar, SignInIntention signInIntention, final g00.a<p> aVar) {
                        e.a.a(eVar, signInIntention.getAuthenticationSourcePage(), signInIntention, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$loadLoggedInScreen$1
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
                        }, 4, null);
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void r(final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, final FragmentManager fragmentManager, androidx.compose.runtime.a aVar, final int i11) {
                        androidx.compose.runtime.a h11 = aVar.h(4437971);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(4437971, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.registerContactEvents (BuyerScaffold.kt:378)");
                        }
                        j0.u.d(p.f75480a, new BuyerScaffoldKt$registerContactEvents$1(buyerListingDetailsScreenViewModel, (Context) h11.q(AndroidCompositionLocals_androidKt.g()), fragmentManager, null), h11, 70);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        d1 l11 = h11.l();
                        if (l11 != null) {
                            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$registerContactEvents$2
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(a aVar2, int i12) {
                                    BuyerScaffoldKt.r(BuyerListingDetailsScreenViewModel.this, fragmentManager, aVar2, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                                    b(aVar2, num.intValue());
                                    return p.f75480a;
                                }
                            });
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r23v0, types: [com.forsale.app.features.categories.user.profile.UserProfileData] */
                    /* JADX WARN: Type inference failed for: r9v0, types: [com.forsale.app.features.categories.user.profile.UserProfileData] */
                    private static final void s(Context context, DetailsModel detailsModel, ListingItemBrief listingItemBrief, String str) {
                        String str2;
                        String str3;
                        Integer userId;
                        Integer num;
                        ListingChatActivity.a aVar = ListingChatActivity.f27334y;
                        String e11 = falcon.chat.utils.a.f56033a.e();
                        String w11 = detailsModel.d().w();
                        String c11 = detailsModel.d().c();
                        String E = detailsModel.d().E();
                        String str4 = null;
                        if (listingItemBrief != null) {
                            str2 = listingItemBrief.getThumb();
                        } else {
                            str2 = null;
                        }
                        BuyerListingDetailsResponseModel.Data.Listing.User F = detailsModel.d().F();
                        if (F != null) {
                            str3 = F.getImage();
                        } else {
                            str3 = null;
                        }
                        BuyerListingDetailsResponseModel.Data.Listing.User F2 = detailsModel.d().F();
                        if (F2 != null && (userId = F2.getUserId()) != null) {
                            long intValue = userId.intValue();
                            String firstName = F2.getFirstName();
                            String phone = F2.getPhone();
                            String image = F2.getImage();
                            String c12 = detailsModel.d().c();
                            if (c12 != null) {
                                num = Integer.valueOf(Integer.parseInt(c12));
                            } else {
                                num = null;
                            }
                            String phone2 = F2.getPhone();
                            if (phone2 != null) {
                                str4 = TypeExtensionsKt.W(phone2);
                            }
                            str4 = new UserProfileData(intValue, firstName, phone, image, num, null, null, null, str4, 224, null);
                        }
                        ListingChatActivity.a.b(aVar, context, e11, w11, c11, E, str2, str3, str, str4, listingItemBrief, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    public static /* synthetic */ void t(Context context, DetailsModel detailsModel, ListingItemBrief listingItemBrief, String str, int i11, Object obj) {
                        if ((i11 & 2) != 0) {
                            listingItemBrief = null;
                        }
                        if ((i11 & 4) != 0) {
                            str = null;
                        }
                        s(context, detailsModel, listingItemBrief, str);
                    }
                }
