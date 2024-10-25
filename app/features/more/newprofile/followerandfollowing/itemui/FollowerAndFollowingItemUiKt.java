package com.forsale.app.features.more.newprofile.followerandfollowing.itemui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.avatars.AvatarSize;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.layouts.ListItemKt;
import com.forsale.ui.components.AvatarsKt;
import e2.h;
import falcon.chat.entities.ExtensionsKt;
import g00.l;
import g00.p;
import g00.q;
import j0.d1;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import t9.y0;
import w.e;
import w.t;
import yj.d;
/* compiled from: FollowerAndFollowingItemUi.kt */
/* loaded from: classes2.dex */
public final class FollowerAndFollowingItemUiKt {

    /* compiled from: FollowerAndFollowingItemUi.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32299a;

        static {
            int[] iArr = new int[CTAsState.values().length];
            try {
                iArr[CTAsState.FOLLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CTAsState.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32299a = iArr;
        }
    }

    public static final void a(final yd.a user, final p<? super String, ? super k0<CTAsState>, wz.p> onFollowCTAClick, final l<? super UserProfileData, wz.p> onUserItemClick, final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        o.i(user, "user");
        o.i(onFollowCTAClick, "onFollowCTAClick");
        o.i(onUserItemClick, "onUserItemClick");
        androidx.compose.runtime.a h11 = aVar.h(-643675704);
        if ((i11 & 14) == 0) {
            if (h11.T(user)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onFollowCTAClick)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onUserItemClick)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.a(z11)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-643675704, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUi (FollowerAndFollowingItemUi.kt:36)");
            }
            androidx.compose.ui.c h12 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
            r0.a b11 = b.b(h11, -2075806640, true, new q<t, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$FollowerAndFollowingItemUi$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(t ListItem, a aVar2, int i17) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i17 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-2075806640, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUi.<anonymous> (FollowerAndFollowingItemUi.kt:40)");
                    }
                    FollowerAndFollowingItemUiKt.b(yd.a.this, aVar2, i12 & 14);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(t tVar, a aVar2, Integer num) {
                    b(tVar, aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
            r0.a b12 = b.b(h11, -565784815, true, new q<t, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$FollowerAndFollowingItemUi$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(t ListItem, a aVar2, int i17) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i17 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-565784815, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUi.<anonymous> (FollowerAndFollowingItemUi.kt:43)");
                    }
                    String d11 = yd.a.this.d();
                    dk.a aVar3 = dk.a.f54291a;
                    int i18 = dk.a.f54292b;
                    TextKt.a(d11, null, 0, 0, false, 0, 0, null, aVar3.c(aVar2, i18).a(), aVar3.a(aVar2, i18).e().m(aVar2, d.f76453b), 0, aVar2, 0, 0, 1278);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(t tVar, a aVar2, Integer num) {
                    b(tVar, aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
            r0.a b13 = b.b(h11, -206199173, true, new q<e, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$FollowerAndFollowingItemUi$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(e ListItem, a aVar2, int i17) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i17 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-206199173, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUi.<anonymous> (FollowerAndFollowingItemUi.kt:50)");
                    }
                    if (!ExtensionsKt.isNullOrEmpty(yd.a.this.c())) {
                        int i18 = y0.B3;
                        Object[] objArr = new Object[1];
                        String c11 = yd.a.this.c();
                        objArr[0] = (c11 == null || (r3 = TypeExtensionsKt.G0(c11)) == null) ? "" : "";
                        String c12 = g.c(i18, objArr, aVar2, 64);
                        dk.a aVar3 = dk.a.f54291a;
                        int i19 = dk.a.f54292b;
                        TextKt.a(c12, null, 0, 0, false, 0, 0, null, aVar3.c(aVar2, i19).h(), aVar3.a(aVar2, i19).e().j(aVar2, d.f76453b), 0, aVar2, 0, 0, 1278);
                    }
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(e eVar, a aVar2, Integer num) {
                    b(eVar, aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
            r0.a b14 = b.b(h11, -1312158779, true, new q<w.c, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$FollowerAndFollowingItemUi$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(w.c ListItem, a aVar2, int i17) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i17 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-1312158779, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUi.<anonymous> (FollowerAndFollowingItemUi.kt:62)");
                    }
                    if (yd.a.this.a() == 1) {
                        yd.a aVar3 = yd.a.this;
                        p<String, k0<CTAsState>, wz.p> pVar = onFollowCTAClick;
                        int i18 = i12;
                        FollowerAndFollowingItemUiKt.c(aVar3, pVar, aVar2, (i18 & 112) | (i18 & 14));
                    }
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(w.c cVar, a aVar2, Integer num) {
                    b(cVar, aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
            h11.C(511388516);
            boolean T = h11.T(user) | h11.T(onUserItemClick);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$FollowerAndFollowingItemUi$5$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        if (yd.a.this.a() == 1) {
                            onUserItemClick.invoke(yd.a.this.g());
                        }
                    }
                };
                h11.u(D);
            }
            h11.S();
            ListItemKt.a(h12, false, b11, b12, null, b13, null, null, b14, z11, 0.0f, 0.0f, 0.0f, (g00.a) D, h11, ((i12 << 18) & 1879048192) | 100863366, 0, 7378);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$FollowerAndFollowingItemUi$6
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i17) {
                    FollowerAndFollowingItemUiKt.a(yd.a.this, onFollowCTAClick, onUserItemClick, z11, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final yd.a aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(-1179713006);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
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
            if (c.I()) {
                c.U(-1179713006, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.ItemAvatar (FollowerAndFollowingItemUi.kt:123)");
            }
            if (ExtensionsKt.isNullOrEmpty(aVar.b())) {
                h11.C(608642221);
                AvatarsKt.c(null, aVar.d(), new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$ItemAvatar$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }
                }, false, null, AvatarSize.SIZE_48, h11, 196992, 25);
                h11.S();
            } else {
                h11.C(608642349);
                AvatarsKt.a(null, h5.d.a(aVar.b(), null, null, null, 0, h11, 0, 30), new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$ItemAvatar$2
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }
                }, false, null, AvatarSize.SIZE_48, h11, 196992, 25);
                h11.S();
            }
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$ItemAvatar$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i14) {
                    FollowerAndFollowingItemUiKt.b(yd.a.this, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final yd.a aVar, final p<? super String, ? super k0<CTAsState>, wz.p> pVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        CTAsState cTAsState;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(1478290255);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(pVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (c.I()) {
                c.U(1478290255, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.ItemCTA (FollowerAndFollowingItemUi.kt:78)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                if (aVar.f().d() == 0) {
                    cTAsState = CTAsState.FOLLOW;
                } else {
                    cTAsState = CTAsState.FOLLOWING;
                }
                D = c0.e(cTAsState, null, 2, null);
                h11.u(D);
            }
            h11.S();
            final k0 k0Var = (k0) D;
            int i15 = a.f32299a[((CTAsState) k0Var.getValue()).ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    h11.C(395220188);
                    h11.S();
                    aVar3 = h11;
                } else {
                    h11.C(395219588);
                    ButtonData e11 = ButtonData.f40994a.e();
                    androidx.compose.ui.c i16 = SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(100)), h.l(32));
                    h11.C(1618982084);
                    boolean T = h11.T(pVar) | h11.T(aVar) | h11.T(k0Var);
                    Object D2 = h11.D();
                    if (T || D2 == c0064a.a()) {
                        D2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$ItemCTA$2$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                pVar.invoke(aVar.e(), k0Var);
                                k0Var.setValue(CTAsState.FOLLOW);
                                aVar.f().g(0);
                            }
                        };
                        h11.u(D2);
                    }
                    h11.S();
                    aVar3 = h11;
                    ButtonsKt.h((g00.a) D2, i16, e11, false, null, null, null, null, null, null, ComposableSingletons$FollowerAndFollowingItemUiKt.f32267a.b(), h11, (ButtonData.f40995b << 6) | 48, 6, 1016);
                    aVar3.S();
                }
            } else {
                h11.C(395218963);
                ButtonData e12 = ButtonData.f40994a.e();
                androidx.compose.ui.c i17 = SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(100)), h.l(32));
                h11.C(1618982084);
                boolean T2 = h11.T(pVar) | h11.T(aVar) | h11.T(k0Var);
                Object D3 = h11.D();
                if (T2 || D3 == c0064a.a()) {
                    D3 = new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$ItemCTA$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            pVar.invoke(aVar.e(), k0Var);
                            k0Var.setValue(CTAsState.FOLLOWING);
                            aVar.f().g(1);
                        }
                    };
                    h11.u(D3);
                }
                h11.S();
                aVar3 = h11;
                ButtonsKt.d((g00.a) D3, i17, e12, null, null, null, null, false, null, null, ComposableSingletons$FollowerAndFollowingItemUiKt.f32267a.a(), h11, (ButtonData.f40995b << 6) | 48, 6, 1016);
                aVar3.S();
            }
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt$ItemCTA$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar4, int i18) {
                    FollowerAndFollowingItemUiKt.c(yd.a.this, pVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
