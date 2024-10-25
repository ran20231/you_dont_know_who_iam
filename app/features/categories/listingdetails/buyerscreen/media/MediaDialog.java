package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.ui.mapcompose.MapPreviewKt;
import com.forsale.app.ui.mapcompose.MapSize;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.core.netowrk.downloadmanger.DownloadStatus;
import com.forsale.core.netowrk.downloadmanger.MediaType;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetValue;
import com.forsale.designSystem.layouts.NavBarsKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.maps.model.LatLng;
import g00.q;
import j0.d1;
import j0.n1;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.z0;
import w.t;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: MediaDialog.kt */
/* loaded from: classes2.dex */
public final class MediaDialog extends com.forsale.app.features.categories.listingdetails.buyerscreen.media.a {

    /* renamed from: f  reason: collision with root package name */
    public com.forsale.core.netowrk.downloadmanger.a f26094f;

    /* renamed from: g  reason: collision with root package name */
    private final h f26095g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.result.b<String> f26096h;

    /* compiled from: MediaDialog.kt */
    /* loaded from: classes2.dex */
    static final class a implements androidx.activity.result.a<Boolean> {
        a() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(Boolean bool) {
            MediaTypes C;
            o.f(bool);
            if (bool.booleanValue() && (C = MediaDialog.this.I().C()) != null) {
                MediaDialog.this.E(C);
            }
        }
    }

    public MediaDialog() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f26095g = FragmentViewModelLazyKt.b(this, s.b(MediaDialogViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
        androidx.activity.result.b<String> registerForActivityResult = registerForActivityResult(new e.c(), new a());
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f26096h = registerForActivityResult;
    }

    private final void D() {
        List<String> y11 = I().y();
        if (y11 != null && I().t().getValue().intValue() < y11.size()) {
            H().d(y11.get(I().t().getValue().intValue()), MediaType.IMAGE, new g00.l<Result<? extends DownloadStatus>, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$downloadImage$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(Object obj) {
                    if (Result.h(obj)) {
                        MediaDialog.this.I().Q();
                    }
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Result<? extends DownloadStatus> result) {
                    b(result.j());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(MediaTypes mediaTypes) {
        if (mediaTypes instanceof MediaTypes.Images) {
            D();
        } else if (mediaTypes instanceof MediaTypes.PDF) {
            G();
        }
    }

    private final void G() {
        H().d(String.valueOf(I().w()), MediaType.PDF, new g00.l<Result<? extends DownloadStatus>, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$downloadPDF$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(Object obj) {
                if (Result.h(obj)) {
                    MediaDialog.this.I().Q();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Result<? extends DownloadStatus> result) {
                b(result.j());
                return p.f75480a;
            }
        });
    }

    private final String J(int i11, int i12) {
        if (Languages.Companion.b() == Languages.ENGLISH) {
            return (i11 + 1) + "/" + i12;
        }
        String T = TypeExtensionsKt.T(i12);
        String T2 = TypeExtensionsKt.T(i11 + 1);
        return T + "/" + T2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(MediaTypes mediaTypes) {
        if (Build.VERSION.SDK_INT < 33) {
            this.f26096h.a("android.permission.WRITE_EXTERNAL_STORAGE");
        } else {
            E(mediaTypes);
        }
    }

    private final void L(MediaDialogViewModel mediaDialogViewModel) {
        LifeCycleUtilsKt.b(this, new MediaDialog$registerContactActionsObservers$1(mediaDialogViewModel, this, null));
    }

    private final void M(MediaDialogViewModel mediaDialogViewModel, ListingDetailsActivity listingDetailsActivity) {
        LifeCycleUtilsKt.b(this, new MediaDialog$registerMediaEventsObservers$1(mediaDialogViewModel, listingDetailsActivity, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.forsale.app.features.categories.user.profile.UserProfileData] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.forsale.app.features.categories.user.profile.UserProfileData] */
    private final void O(DetailsModel detailsModel, ListingItemBrief listingItemBrief, String str) {
        String str2;
        String str3;
        Integer userId;
        Context context = getContext();
        if (context != null) {
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
                Integer valueOf = Integer.valueOf(Integer.parseInt(detailsModel.d().c()));
                String phone2 = F2.getPhone();
                if (phone2 != null) {
                    str4 = TypeExtensionsKt.W(phone2);
                }
                str4 = new UserProfileData(intValue, firstName, phone, image, valueOf, null, null, null, str4, 224, null);
            }
            ListingChatActivity.a.b(aVar, context, e11, w11, c11, E, str2, str3, str, str4, listingItemBrief, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void Q(MediaDialog mediaDialog, DetailsModel detailsModel, ListingItemBrief listingItemBrief, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            listingItemBrief = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        mediaDialog.O(detailsModel, listingItemBrief, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(final LatLng latLng, final boolean z11, final androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1822690482);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1822690482, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.LargeMap (MediaDialog.kt:502)");
        }
        LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
        MapSize mapSize = MapSize.LARGE;
        MapPreviewKt.e(new wh.a(latLng2, com.forsale.app.ui.mapcompose.b.a(z11, mapSize), mapSize, 0.0f, 8, null), cVar, null, h11, ((i11 >> 3) & 112) | 8, 4);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$LargeMap$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MediaDialog.this.q(latLng, z11, cVar, aVar2, v0.a(i11 | 1));
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(final java.lang.Integer r22, final java.util.List<java.lang.String> r23, androidx.compose.runtime.a r24, final int r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r4 = -1854902489(0xffffffff91706f27, float:-1.8966913E-28)
            r5 = r24
            androidx.compose.runtime.a r14 = r5.h(r4)
            boolean r5 = androidx.compose.runtime.c.I()
            if (r5 == 0) goto L1d
            r5 = -1
            java.lang.String r6 = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.MediaTitle (MediaDialog.kt:324)"
            androidx.compose.runtime.c.U(r4, r3, r5, r6)
        L1d:
            if (r1 == 0) goto L6c
            if (r2 == 0) goto L6c
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r5 = r4.size()
            r6 = 1
            if (r5 <= r6) goto L6c
            r5 = -689499884(0xffffffffd6e71114, float:-1.27030268E14)
            r14.C(r5)
            int r5 = r22.intValue()
            int r4 = r4.size()
            java.lang.String r5 = r0.J(r5, r4)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            dk.a r4 = dk.a.f54291a
            int r15 = dk.a.f54292b
            yj.b r4 = r4.a(r14, r15)
            yj.d r4 = r4.e()
            int r15 = yj.d.f76453b
            long r15 = r4.m(r14, r15)
            r4 = 0
            r18 = 0
            r19 = 0
            r20 = 1534(0x5fe, float:2.15E-42)
            r24 = r14
            r14 = r15
            r16 = r4
            r17 = r24
            com.forsale.designSystem.TextKt.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20)
            r24.S()
            goto Lb5
        L6c:
            r24 = r14
            com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r4 = r21.I()
            com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes r4 = r4.C()
            boolean r4 = r4 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes.Map
            if (r4 == 0) goto Lb8
            r4 = -689499651(0xffffffffd6e711fd, float:-1.27032223E14)
            r14 = r24
            r14.C(r4)
            int r4 = t9.y0.U9
            r5 = 0
            java.lang.String r5 = p1.g.b(r4, r14, r5)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            dk.a r4 = dk.a.f54291a
            int r15 = dk.a.f54292b
            yj.b r4 = r4.a(r14, r15)
            yj.d r4 = r4.e()
            int r15 = yj.d.f76453b
            long r15 = r4.m(r14, r15)
            r4 = 0
            r18 = 0
            r19 = 0
            r20 = 1534(0x5fe, float:2.15E-42)
            r14 = r15
            r16 = r4
            r17 = r24
            com.forsale.designSystem.TextKt.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20)
            r24.S()
        Lb5:
            r5 = r24
            goto Lc3
        Lb8:
            r4 = -689499477(0xffffffffd6e712ab, float:-1.27033682E14)
            r5 = r24
            r5.C(r4)
            r5.S()
        Lc3:
            boolean r4 = androidx.compose.runtime.c.I()
            if (r4 == 0) goto Lcc
            androidx.compose.runtime.c.T()
        Lcc:
            j0.d1 r4 = r5.l()
            if (r4 != 0) goto Ld3
            goto Ldb
        Ld3:
            com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$MediaTitle$1 r5 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$MediaTitle$1
            r5.<init>()
            r4.a(r5)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.r(java.lang.Integer, java.util.List, androidx.compose.runtime.a, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r30, final g00.a<wz.p> r31, final g00.a<wz.p> r32, androidx.compose.runtime.a r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 1187
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.s(com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel, g00.a, g00.a, androidx.compose.runtime.a, int, int):void");
    }

    private static final int t(n1<Integer> n1Var) {
        return n1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(final Integer num, final List<String> list, final g00.a<p> aVar, final g00.a<p> aVar2, final g00.l<? super MediaTypes, p> lVar, androidx.compose.runtime.a aVar3, final int i11) {
        androidx.compose.runtime.a h11 = aVar3.h(-286877247);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-286877247, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.ToolBar (MediaDialog.kt:269)");
        }
        NavBarsKt.a(PaddingKt.i(BackgroundKt.b(androidx.compose.ui.c.f7566a, dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b), null, 2, null), e2.h.l(4)), r0.b.b(h11, 229789511, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.a] */
            /* JADX WARN: Type inference failed for: r1v3 */
            public final void b(androidx.compose.runtime.a aVar4, int i12) {
                if ((i12 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(229789511, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.ToolBar.<anonymous> (MediaDialog.kt:275)");
                }
                final g00.a<p> aVar5 = aVar;
                aVar4.C(1157296644);
                boolean T = aVar4.T(aVar5);
                Object D = aVar4.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r13v1 'aVar5' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$1$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r13 & 11
                        r1 = 2
                        if (r0 != r1) goto L10
                        boolean r0 = r12.i()
                        if (r0 != 0) goto Lc
                        goto L10
                    Lc:
                        r12.L()
                        goto L62
                    L10:
                        boolean r0 = androidx.compose.runtime.c.I()
                        if (r0 == 0) goto L1f
                        r0 = -1
                        java.lang.String r1 = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.ToolBar.<anonymous> (MediaDialog.kt:275)"
                        r2 = 229789511(0xdb24f47, float:1.0989182E-30)
                        androidx.compose.runtime.c.U(r2, r13, r0, r1)
                    L1f:
                        g00.a<wz.p> r13 = r1
                        r0 = 1157296644(0x44faf204, float:2007.563)
                        r12.C(r0)
                        boolean r0 = r12.T(r13)
                        java.lang.Object r1 = r12.D()
                        if (r0 != 0) goto L39
                        androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r0 = r0.a()
                        if (r1 != r0) goto L41
                    L39:
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$1$1$1 r1 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$1$1$1
                        r1.<init>(r13)
                        r12.u(r1)
                    L41:
                        r12.S()
                        r2 = r1
                        g00.a r2 = (g00.a) r2
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.ComposableSingletons$MediaDialogKt r13 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.ComposableSingletons$MediaDialogKt.f26087a
                        g00.p r7 = r13.a()
                        r9 = 196608(0x30000, float:2.75506E-40)
                        r10 = 30
                        r8 = r12
                        com.forsale.designSystem.buttons.ButtonsKt.g(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                        boolean r12 = androidx.compose.runtime.c.I()
                        if (r12 == 0) goto L62
                        androidx.compose.runtime.c.T()
                    L62:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$1.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num2) {
                    b(aVar4, num2.intValue());
                    return p.f75480a;
                }
            }), r0.b.b(h11, -1921693624, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    if ((i12 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1921693624, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.ToolBar.<anonymous> (MediaDialog.kt:272)");
                    }
                    MediaDialog.this.r(num, list, aVar4, (i11 & 14) | 576);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num2) {
                    b(aVar4, num2.intValue());
                    return p.f75480a;
                }
            }), r0.b.b(h11, -2136021775, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
                    if (r13 == false) goto L36;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.a] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void b(w.t r11, androidx.compose.runtime.a r12, int r13) {
                    /*
                        r10 = this;
                        java.lang.String r0 = "$this$NavBarInner"
                        kotlin.jvm.internal.o.i(r11, r0)
                        r11 = r13 & 81
                        r0 = 16
                        if (r11 != r0) goto L17
                        boolean r11 = r12.i()
                        if (r11 != 0) goto L12
                        goto L17
                    L12:
                        r12.L()
                        goto Ld8
                    L17:
                        boolean r11 = androidx.compose.runtime.c.I()
                        if (r11 == 0) goto L26
                        r11 = -1
                        java.lang.String r0 = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.ToolBar.<anonymous> (MediaDialog.kt:289)"
                        r1 = -2136021775(0xffffffff80aee4f1, float:-1.6061505E-38)
                        androidx.compose.runtime.c.U(r1, r13, r11, r0)
                    L26:
                        r11 = 147829109(0x8cfb175, float:1.2500079E-33)
                        r12.C(r11)
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r11 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.this
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r11 = r11.I()
                        java.lang.String r11 = r11.w()
                        r13 = 0
                        r0 = 1
                        if (r11 == 0) goto L43
                        int r11 = r11.length()
                        if (r11 != 0) goto L41
                        goto L43
                    L41:
                        r11 = r13
                        goto L44
                    L43:
                        r11 = r0
                    L44:
                        if (r11 == 0) goto L5d
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r11 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.this
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r11 = r11.I()
                        java.util.List r11 = r11.y()
                        java.util.Collection r11 = (java.util.Collection) r11
                        if (r11 == 0) goto L5a
                        boolean r11 = r11.isEmpty()
                        if (r11 == 0) goto L5b
                    L5a:
                        r13 = r0
                    L5b:
                        if (r13 != 0) goto L84
                    L5d:
                        androidx.compose.ui.c$a r11 = androidx.compose.ui.c.f7566a
                        com.forsale.app.features.categories.listingdetails.buyerscreen.utils.BuyerDetailsComponentTags r13 = com.forsale.app.features.categories.listingdetails.buyerscreen.utils.BuyerDetailsComponentTags.LISTING_DETAILS_NAVBAR_DOWNLOAD_ICON
                        java.lang.String r13 = r13.getTag()
                        androidx.compose.ui.c r1 = androidx.compose.ui.platform.TestTagKt.a(r11, r13)
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$3$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$3$1
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r11 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.this
                        g00.l<com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes, wz.p> r13 = r4
                        r0.<init>()
                        r2 = 0
                        r3 = 0
                        r4 = 0
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.ComposableSingletons$MediaDialogKt r11 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.ComposableSingletons$MediaDialogKt.f26087a
                        g00.p r5 = r11.b()
                        r7 = 196656(0x30030, float:2.75574E-40)
                        r8 = 28
                        r6 = r12
                        com.forsale.designSystem.buttons.ButtonsKt.g(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    L84:
                        r12.S()
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r11 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.this
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r11 = r11.I()
                        com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes r11 = r11.C()
                        boolean r11 = r11 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes.Map
                        if (r11 != 0) goto Lcf
                        g00.a<wz.p> r11 = r2
                        r13 = 1157296644(0x44faf204, float:2007.563)
                        r12.C(r13)
                        boolean r13 = r12.T(r11)
                        java.lang.Object r0 = r12.D()
                        if (r13 != 0) goto Laf
                        androidx.compose.runtime.a$a r13 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r13 = r13.a()
                        if (r0 != r13) goto Lb7
                    Laf:
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$3$2$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$3$2$1
                        r0.<init>(r11)
                        r12.u(r0)
                    Lb7:
                        r12.S()
                        r1 = r0
                        g00.a r1 = (g00.a) r1
                        r2 = 0
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        com.forsale.app.features.categories.listingdetails.buyerscreen.media.ComposableSingletons$MediaDialogKt r11 = com.forsale.app.features.categories.listingdetails.buyerscreen.media.ComposableSingletons$MediaDialogKt.f26087a
                        g00.p r6 = r11.c()
                        r8 = 196608(0x30000, float:2.75506E-40)
                        r9 = 30
                        r7 = r12
                        com.forsale.designSystem.buttons.ButtonsKt.g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    Lcf:
                        boolean r11 = androidx.compose.runtime.c.I()
                        if (r11 == 0) goto Ld8
                        androidx.compose.runtime.c.T()
                    Ld8:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$3.b(w.t, androidx.compose.runtime.a, int):void");
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar4, Integer num2) {
                    b(tVar, aVar4, num2.intValue());
                    return p.f75480a;
                }
            }), false, h11, 28080, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$ToolBar$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i12) {
                        MediaDialog.this.w(num, list, aVar, aVar2, lVar, aVar4, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num2) {
                        b(aVar4, num2.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final com.forsale.core.netowrk.downloadmanger.a H() {
            com.forsale.core.netowrk.downloadmanger.a aVar = this.f26094f;
            if (aVar != null) {
                return aVar;
            }
            o.w("downloadMediaInteractor");
            return null;
        }

        public final MediaDialogViewModel I() {
            return (MediaDialogViewModel) this.f26095g.getValue();
        }

        @Override // androidx.fragment.app.j
        public int getTheme() {
            return z0.f70797g;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
            o.i(inflater, "inflater");
            androidx.appcompat.app.d l11 = ContextExtensionsKt.l(getContext());
            L(I());
            MediaDialogViewModel I = I();
            o.g(l11, "null cannot be cast to non-null type com.forsale.app.features.categories.listingdetails.ListingDetailsActivity");
            M(I, (ListingDetailsActivity) l11);
            Context requireContext = requireContext();
            o.h(requireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
            composeView.setContent(r0.b.c(-1056388032, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: MediaDialog.kt */
                /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends Lambda implements g00.p<androidx.compose.runtime.a, Integer, p> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ MediaDialog f26155a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(MediaDialog mediaDialog) {
                        super(2);
                        this.f26155a = mediaDialog;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final ab.a e(n1<ab.a> n1Var) {
                        return n1Var.getValue();
                    }

                    public final void c(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1991865321, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.onCreateView.<anonymous>.<anonymous>.<anonymous> (MediaDialog.kt:114)");
                        }
                        n1 b11 = z.b(this.f26155a.I().s(), null, aVar, 8, 1);
                        ModalBottomSheetState k11 = BottomSheetsKt.k(ModalBottomSheetValue.Hidden, null, true, null, aVar, 390, 10);
                        final MediaDialog mediaDialog = this.f26155a;
                        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.onCreateView.1.1.1.1
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
                                MediaDialog.this.dismiss();
                            }
                        };
                        final MediaDialog mediaDialog2 = this.f26155a;
                        mediaDialog.s(null, aVar2, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.onCreateView.1.1.1.2
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
                                MediaDialog.this.I().K();
                            }
                        }, aVar, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, 1);
                        final ab.a e11 = e(b11);
                        if (e11 != null) {
                            final MediaDialog mediaDialog3 = this.f26155a;
                            Boolean valueOf = Boolean.valueOf(e(b11).c());
                            aVar.C(511388516);
                            boolean T = aVar.T(b11) | aVar.T(k11);
                            Object D = aVar.D();
                            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                                D = new MediaDialog$onCreateView$1$1$1$3$1$1(k11, b11, null);
                                aVar.u(D);
                            }
                            aVar.S();
                            u.d(valueOf, (g00.p) D, aVar, 64);
                            ShowCTAsBottomSheetKt.b(k11, e11, r0.b.b(aVar, -1277029409, true, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b3: INVOKE  
                                  (r10v0 'k11' com.forsale.designSystem.bottomsheets.ModalBottomSheetState)
                                  (r1v4 'e11' ab.a)
                                  (wrap: r0.a : 0x00a1: INVOKE  (r2v7 r0.a A[REMOVE]) = 
                                  (r12v0 'aVar' androidx.compose.runtime.a)
                                  (-1277029409 int)
                                  true
                                  (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x009b: CONSTRUCTOR  (r2v6 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r1v4 'e11' ab.a A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$2.<init>(ab.a):void type: CONSTRUCTOR)
                                 type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                                  (wrap: g00.l<java.lang.String, wz.p> : 0x00a7: CONSTRUCTOR  (r3v7 g00.l<java.lang.String, wz.p> A[REMOVE]) = 
                                  (r1v4 'e11' ab.a A[DONT_INLINE])
                                  (r0v6 'mediaDialog3' com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$3.<init>(ab.a, com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog):void type: CONSTRUCTOR)
                                  (wrap: g00.a<wz.p> : 0x00ac: CONSTRUCTOR  (r4v8 g00.a<wz.p> A[REMOVE]) = (r0v6 'mediaDialog3' com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$4.<init>(com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog):void type: CONSTRUCTOR)
                                  (r12v0 'aVar' androidx.compose.runtime.a)
                                  (448 int)
                                 type: STATIC call: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt.b(com.forsale.designSystem.bottomsheets.ModalBottomSheetState, ab.a, g00.p, g00.l, g00.a, androidx.compose.runtime.a, int):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1.1.c(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$2, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r1 = r13 & 11
                                r2 = 2
                                if (r1 != r2) goto L11
                                boolean r1 = r12.i()
                                if (r1 != 0) goto Lc
                                goto L11
                            Lc:
                                r12.L()
                                goto Lbf
                            L11:
                                boolean r1 = androidx.compose.runtime.c.I()
                                if (r1 == 0) goto L20
                                r1 = -1
                                java.lang.String r2 = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.onCreateView.<anonymous>.<anonymous>.<anonymous> (MediaDialog.kt:114)"
                                r3 = -1991865321(0xffffffff89468c17, float:-2.3899253E-33)
                                androidx.compose.runtime.c.U(r3, r13, r1, r2)
                            L20:
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r0 = r11.f26155a
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel r0 = r0.I()
                                kotlinx.coroutines.flow.StateFlow r0 = r0.s()
                                r1 = 8
                                r7 = 0
                                r8 = 1
                                j0.n1 r9 = androidx.compose.runtime.z.b(r0, r7, r12, r1, r8)
                                com.forsale.designSystem.bottomsheets.ModalBottomSheetValue r0 = com.forsale.designSystem.bottomsheets.ModalBottomSheetValue.Hidden
                                r1 = 0
                                r2 = 1
                                r3 = 0
                                r5 = 390(0x186, float:5.47E-43)
                                r6 = 10
                                r4 = r12
                                com.forsale.designSystem.bottomsheets.ModalBottomSheetState r10 = com.forsale.designSystem.bottomsheets.BottomSheetsKt.k(r0, r1, r2, r3, r4, r5, r6)
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r0 = r11.f26155a
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$1 r2 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$1
                                r2.<init>()
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$2 r3 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$2
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r4 = r11.f26155a
                                r3.<init>()
                                r5 = 4096(0x1000, float:5.74E-42)
                                r6 = 1
                                r4 = r12
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.z(r0, r1, r2, r3, r4, r5, r6)
                                ab.a r1 = e(r9)
                                if (r1 != 0) goto L5c
                                goto Lb6
                            L5c:
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog r0 = r11.f26155a
                                ab.a r2 = e(r9)
                                boolean r2 = r2.c()
                                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                                r3 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                                r12.C(r3)
                                boolean r3 = r12.T(r9)
                                boolean r4 = r12.T(r10)
                                r3 = r3 | r4
                                java.lang.Object r4 = r12.D()
                                if (r3 != 0) goto L87
                                androidx.compose.runtime.a$a r3 = androidx.compose.runtime.a.f7182a
                                java.lang.Object r3 = r3.a()
                                if (r4 != r3) goto L8f
                            L87:
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$1$1 r4 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$1$1
                                r4.<init>(r10, r9, r7)
                                r12.u(r4)
                            L8f:
                                r12.S()
                                g00.p r4 = (g00.p) r4
                                r3 = 64
                                j0.u.d(r2, r4, r12, r3)
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$2 r2 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$2
                                r2.<init>(r1)
                                r3 = -1277029409(0xffffffffb3e213df, float:-1.05275596E-7)
                                r0.a r2 = r0.b.b(r12, r3, r8, r2)
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$3 r3 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$3
                                r3.<init>(r1, r0)
                                com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$4 r4 = new com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1$1$3$4
                                r4.<init>(r0)
                                r6 = 448(0x1c0, float:6.28E-43)
                                r0 = r10
                                r5 = r12
                                com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt.b(r0, r1, r2, r3, r4, r5, r6)
                            Lb6:
                                boolean r0 = androidx.compose.runtime.c.I()
                                if (r0 == 0) goto Lbf
                                androidx.compose.runtime.c.T()
                            Lbf:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$onCreateView$1$1.AnonymousClass1.c(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                            c(aVar, num.intValue());
                            return p.f75480a;
                        }
                    }

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
                            androidx.compose.runtime.c.U(-1056388032, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.onCreateView.<anonymous>.<anonymous> (MediaDialog.kt:113)");
                        }
                        ThemeKt.a(null, null, r0.b.b(aVar, -1991865321, true, new AnonymousClass1(MediaDialog.this)), aVar, 384, 3);
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
        }
