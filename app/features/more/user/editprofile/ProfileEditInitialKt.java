package com.forsale.app.features.more.user.editprofile;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.t1;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.features.more.user.editprofile.a;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.avatars.AvatarSize;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.buttons.IconButtonKt;
import com.forsale.designSystem.buttons.IconButtonShape;
import com.forsale.designSystem.buttons.IconButtonSize;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.layouts.ListItemKt;
import com.forsale.designSystem.layouts.SectionTitleData;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.ui.components.AvatarsKt;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.t0;
import j0.v0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import t9.y0;
import v0.b;
import w.t;
import w.u;
import wz.p;
/* compiled from: ProfileEditInitial.kt */
/* loaded from: classes2.dex */
public final class ProfileEditInitialKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final UserEntity userEntity, final l<? super a, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-310260315);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-310260315, i11, -1, "com.forsale.app.features.more.user.editprofile.AccountSettingsSection (ProfileEditInitial.kt:85)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        b(h11, 0);
        h11.C(1157296644);
        boolean T = h11.T(lVar);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$AccountSettingsSection$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    lVar.invoke(a.C0360a.f33108a);
                }
            };
            h11.u(D);
        }
        h11.S();
        c((g00.a) D, h11, 0);
        h11.C(1157296644);
        boolean T2 = h11.T(lVar);
        Object D2 = h11.D();
        if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
            D2 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$AccountSettingsSection$1$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    lVar.invoke(a.e.f33112a);
                }
            };
            h11.u(D2);
        }
        h11.S();
        g((g00.a) D2, h11, 0);
        h11.C(1157296644);
        boolean T3 = h11.T(lVar);
        Object D3 = h11.D();
        if (T3 || D3 == androidx.compose.runtime.a.f7182a.a()) {
            D3 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$AccountSettingsSection$1$3$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    lVar.invoke(a.b.f33109a);
                }
            };
            h11.u(D3);
        }
        h11.S();
        d((g00.a) D3, h11, 0);
        h((userEntity == null || (r0 = userEntity.getMemberSince()) == null) ? "" : "", h11, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$AccountSettingsSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    ProfileEditInitialKt.a(UserEntity.this, lVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-420223181);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-420223181, i11, -1, "com.forsale.app.features.more.user.editprofile.AccountSettingsTitle (ProfileEditInitial.kt:304)");
            }
            SectionTitleKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, e2.h.l(12), 0.0f, 0.0f, 13, null), SectionTitleData.f41869a.b(), ComposableSingletons$ProfileEditInitialKt.f32865a.c(), null, null, null, h11, (SectionTitleData.f41870b << 3) | 390, 56);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$AccountSettingsTitle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    ProfileEditInitialKt.b(aVar2, v0.a(i11 | 1));
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
    public static final void c(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(636996828);
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
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(636996828, i12, -1, "com.forsale.app.features.more.user.editprofile.ChangePassword (ProfileEditInitial.kt:320)");
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            ComposableSingletons$ProfileEditInitialKt composableSingletons$ProfileEditInitialKt = ComposableSingletons$ProfileEditInitialKt.f32865a;
            aVar3 = h11;
            ListItemKt.a(aVar4, false, composableSingletons$ProfileEditInitialKt.d(), composableSingletons$ProfileEditInitialKt.e(), null, composableSingletons$ProfileEditInitialKt.f(), null, null, composableSingletons$ProfileEditInitialKt.g(), false, 0.0f, 0.0f, 0.0f, aVar, aVar3, 100863366, (i12 << 9) & 7168, 7890);
            DividersKt.a(PaddingKt.k(aVar4, e2.h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$ChangePassword$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i14) {
                    ProfileEditInitialKt.c(aVar, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(2062566300);
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
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(2062566300, i12, -1, "com.forsale.app.features.more.user.editprofile.Delete (ProfileEditInitial.kt:383)");
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            ComposableSingletons$ProfileEditInitialKt composableSingletons$ProfileEditInitialKt = ComposableSingletons$ProfileEditInitialKt.f32865a;
            q<t, androidx.compose.runtime.a, Integer, p> m11 = composableSingletons$ProfileEditInitialKt.m();
            q<t, androidx.compose.runtime.a, Integer, p> n11 = composableSingletons$ProfileEditInitialKt.n();
            q<w.e, androidx.compose.runtime.a, Integer, p> o11 = composableSingletons$ProfileEditInitialKt.o();
            q<w.c, androidx.compose.runtime.a, Integer, p> p11 = composableSingletons$ProfileEditInitialKt.p();
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Delete$1$1
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
                h11.u(D);
            }
            h11.S();
            aVar3 = h11;
            ListItemKt.a(aVar4, false, m11, n11, null, o11, null, null, p11, false, 0.0f, 0.0f, 0.0f, (g00.a) D, aVar3, 100863366, 0, 7890);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Delete$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i14) {
                    ProfileEditInitialKt.d(aVar, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(1722263341);
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
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1722263341, i12, -1, "com.forsale.app.features.more.user.editprofile.EditCircle (ProfileEditInitial.kt:154)");
            }
            Painter d11 = p1.e.d(sj.d.f68684u, h11, 0);
            IconButtonShape iconButtonShape = IconButtonShape.Circle;
            IconButtonSize iconButtonSize = IconButtonSize.Small;
            dk.a aVar4 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            yj.d f11 = aVar4.a(h11, i14).f();
            int i15 = yj.d.f76453b;
            long i16 = f11.i(h11, i15);
            long c11 = aVar4.a(h11, i14).g().c(h11, i15);
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$EditCircle$1$1
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
                h11.u(D);
            }
            h11.S();
            t1 g11 = t1.g(c11);
            aVar3 = h11;
            IconButtonKt.a((g00.a) D, d11, iconButtonShape, iconButtonSize, i16, null, false, null, g11, h11, 3520, 224);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$EditCircle$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i17) {
                    ProfileEditInitialKt.e(aVar, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final String str, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(667096602);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
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
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(667096602, i12, -1, "com.forsale.app.features.more.user.editprofile.Email (ProfileEditInitial.kt:234)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            ComposableSingletons$ProfileEditInitialKt composableSingletons$ProfileEditInitialKt = ComposableSingletons$ProfileEditInitialKt.f32865a;
            aVar2 = h11;
            ListItemKt.a(aVar3, false, composableSingletons$ProfileEditInitialKt.s(), composableSingletons$ProfileEditInitialKt.t(), null, r0.b.b(h11, 781628365, true, new q<w.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Email$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.e ListItem, androidx.compose.runtime.a aVar4, int i14) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i14 & 81) == 16 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(781628365, i14, -1, "com.forsale.app.features.more.user.editprofile.Email.<anonymous> (ProfileEditInitial.kt:251)");
                    }
                    TextKt.a(str, null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar4, dk.a.f54292b).a(), 0L, 0, aVar4, i12 & 14, 0, 1790);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(w.e eVar, androidx.compose.runtime.a aVar4, Integer num) {
                    b(eVar, aVar4, num.intValue());
                    return p.f75480a;
                }
            }), null, null, null, true, 0.0f, 0.0f, 0.0f, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Email$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            }, aVar2, 805506438, 3072, 7634);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Email$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    ProfileEditInitialKt.f(str, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(1399394365);
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
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1399394365, i12, -1, "com.forsale.app.features.more.user.editprofile.LogOut (ProfileEditInitial.kt:351)");
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            ComposableSingletons$ProfileEditInitialKt composableSingletons$ProfileEditInitialKt = ComposableSingletons$ProfileEditInitialKt.f32865a;
            q<t, androidx.compose.runtime.a, Integer, p> h12 = composableSingletons$ProfileEditInitialKt.h();
            q<t, androidx.compose.runtime.a, Integer, p> i14 = composableSingletons$ProfileEditInitialKt.i();
            q<w.e, androidx.compose.runtime.a, Integer, p> j11 = composableSingletons$ProfileEditInitialKt.j();
            q<w.c, androidx.compose.runtime.a, Integer, p> k11 = composableSingletons$ProfileEditInitialKt.k();
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$LogOut$1$1
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
                h11.u(D);
            }
            h11.S();
            aVar3 = h11;
            ListItemKt.a(aVar4, false, h12, i14, null, j11, null, null, k11, false, 0.0f, 0.0f, 0.0f, (g00.a) D, aVar3, 100863366, 0, 7890);
            DividersKt.a(PaddingKt.k(aVar4, e2.h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$LogOut$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i15) {
                    ProfileEditInitialKt.g(aVar, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(final String str, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(1596872894);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
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
                androidx.compose.runtime.c.U(1596872894, i11, -1, "com.forsale.app.features.more.user.editprofile.MemberSince (ProfileEditInitial.kt:414)");
            }
            float f11 = 16;
            androidx.compose.ui.c i14 = PaddingKt.i(IntrinsicKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), IntrinsicSize.Min), e2.h.l(f11));
            b.InterfaceC0889b g11 = v0.b.f74009a.g();
            Arrangement.f o11 = Arrangement.f3698a.o(e2.h.l(f11));
            h11.C(-483455358);
            a0 a11 = androidx.compose.foundation.layout.e.a(o11, g11, h11, 54);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i14);
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            w.f fVar = w.f.f74891a;
            CompositionLocalKt.a(CompositionLocalsKt.j().c(LayoutDirection.Rtl), r0.b.b(h11, 987482868, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$MemberSince$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i15) {
                    if ((i15 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(987482868, i15, -1, "com.forsale.app.features.more.user.editprofile.MemberSince.<anonymous>.<anonymous> (ProfileEditInitial.kt:426)");
                    }
                    w wVar = w.f61809a;
                    String format = String.format(new Locale(Languages.Companion.b().getValue()), p1.g.b(y0.K3, aVar2, 0), Arrays.copyOf(new Object[]{TypeExtensionsKt.F0(str)}, 1));
                    o.h(format, "format(...)");
                    dk.a aVar3 = dk.a.f54291a;
                    int i16 = dk.a.f54292b;
                    TextKt.a(format, null, 0, 0, false, 0, 0, null, aVar3.c(aVar2, i16).h(), aVar3.a(aVar2, i16).e().j(aVar2, yj.d.f76453b), 0, aVar2, 0, 0, 1278);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, 0 | t0.f59917d | 48);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$MemberSince$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i15) {
                    ProfileEditInitialKt.h(str, aVar2, v0.a(i11 | 1));
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
    public static final void i(final String str, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(794152677);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
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
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(794152677, i12, -1, "com.forsale.app.features.more.user.editprofile.Name (ProfileEditInitial.kt:202)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            ComposableSingletons$ProfileEditInitialKt composableSingletons$ProfileEditInitialKt = ComposableSingletons$ProfileEditInitialKt.f32865a;
            aVar2 = h11;
            ListItemKt.a(aVar3, false, composableSingletons$ProfileEditInitialKt.q(), composableSingletons$ProfileEditInitialKt.r(), null, r0.b.b(h11, 797847250, true, new q<w.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Name$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.e ListItem, androidx.compose.runtime.a aVar4, int i14) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i14 & 81) == 16 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(797847250, i14, -1, "com.forsale.app.features.more.user.editprofile.Name.<anonymous> (ProfileEditInitial.kt:222)");
                    }
                    TextKt.a(str, null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar4, dk.a.f54292b).a(), 0L, 0, aVar4, i12 & 14, 0, 1790);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(w.e eVar, androidx.compose.runtime.a aVar4, Integer num) {
                    b(eVar, aVar4, num.intValue());
                    return p.f75480a;
                }
            }), null, null, null, true, 0.0f, 0.0f, 0.0f, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Name$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            }, aVar2, 805506438, 3072, 7634);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Name$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    ProfileEditInitialKt.i(str, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        final int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(1778650457);
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
                androidx.compose.runtime.c.U(1778650457, i12, -1, "com.forsale.app.features.more.user.editprofile.PersonalInfoTitle (ProfileEditInitial.kt:167)");
            }
            SectionTitleKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, e2.h.l(12), 0.0f, 0.0f, 13, null), SectionTitleData.f41869a.b(), ComposableSingletons$ProfileEditInitialKt.f32865a.a(), null, r0.b.b(h11, 799975381, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$PersonalInfoTitle$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i14) {
                    if ((i14 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(799975381, i14, -1, "com.forsale.app.features.more.user.editprofile.PersonalInfoTitle.<anonymous> (ProfileEditInitial.kt:180)");
                    }
                    ButtonsKt.k(aVar, null, ButtonData.f40994a.c(), false, false, null, ComposableSingletons$ProfileEditInitialKt.f32865a.l(), aVar3, (i12 & 14) | 1572864 | (ButtonData.f40995b << 6), 58);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            }), null, h11, (SectionTitleData.f41870b << 3) | 24966, 40);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$PersonalInfoTitle$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i14) {
                    ProfileEditInitialKt.j(aVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final UserEntity userEntity, final l<? super a, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        String phone;
        androidx.compose.runtime.a h11 = aVar.h(458002889);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(458002889, i11, -1, "com.forsale.app.features.more.user.editprofile.PersonalInformationSection (ProfileEditInitial.kt:72)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        h11.C(1157296644);
        boolean T = h11.T(lVar);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$PersonalInformationSection$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    lVar.invoke(a.d.f33111a);
                }
            };
            h11.u(D);
        }
        h11.S();
        j((g00.a) D, h11, 0);
        String str = "";
        i((userEntity == null || (r1 = userEntity.getFirstName()) == null) ? "" : "", h11, 0);
        f((userEntity == null || (r1 = userEntity.getEmail()) == null) ? "" : "", h11, 0);
        if (userEntity != null && (phone = userEntity.getPhone()) != null) {
            str = phone;
        }
        l(str, h11, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$PersonalInformationSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    ProfileEditInitialKt.k(UserEntity.this, lVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final String str, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-201525908);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
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
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-201525908, i12, -1, "com.forsale.app.features.more.user.editprofile.Phone (ProfileEditInitial.kt:263)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            ComposableSingletons$ProfileEditInitialKt composableSingletons$ProfileEditInitialKt = ComposableSingletons$ProfileEditInitialKt.f32865a;
            aVar2 = h11;
            ListItemKt.a(aVar3, false, composableSingletons$ProfileEditInitialKt.u(), composableSingletons$ProfileEditInitialKt.v(), null, r0.b.b(h11, -86994145, true, new q<w.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Phone$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.e ListItem, androidx.compose.runtime.a aVar4, int i14) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i14 & 81) == 16 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-86994145, i14, -1, "com.forsale.app.features.more.user.editprofile.Phone.<anonymous> (ProfileEditInitial.kt:283)");
                    }
                    TextKt.a(str, null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar4, dk.a.f54292b).a(), 0L, 0, aVar4, i12 & 14, 0, 1790);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(w.e eVar, androidx.compose.runtime.a aVar4, Integer num) {
                    b(eVar, aVar4, num.intValue());
                    return p.f75480a;
                }
            }), null, null, composableSingletons$ProfileEditInitialKt.b(), false, 0.0f, 0.0f, 0.0f, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Phone$2
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            }, aVar2, 100863366, 3072, 7890);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$Phone$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    ProfileEditInitialKt.l(str, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void m(final UserEntity userEntity, final l<? super a, p> onActionClicked, androidx.compose.runtime.a aVar, final int i11) {
        String str;
        o.i(onActionClicked, "onActionClicked");
        androidx.compose.runtime.a h11 = aVar.h(-2046154303);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-2046154303, i11, -1, "com.forsale.app.features.more.user.editprofile.ProfileEditInitial (ProfileEditInitial.kt:53)");
        }
        androidx.compose.ui.c f11 = ScrollKt.f(androidx.compose.ui.c.f7566a, ScrollKt.c(0, h11, 0, 1), false, null, false, 14, null);
        Arrangement.f o11 = Arrangement.f3698a.o(e2.h.l(4));
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(o11, v0.b.f74009a.k(), h11, 6);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(f11);
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        if (userEntity != null) {
            str = userEntity.getImage();
        } else {
            str = null;
        }
        String str2 = (userEntity == null || (str2 = userEntity.getFirstName()) == null) ? "" : "";
        h11.C(1157296644);
        boolean T = h11.T(onActionClicked);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$ProfileEditInitial$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    onActionClicked.invoke(a.c.f33110a);
                }
            };
            h11.u(D);
        }
        h11.S();
        o(str, str2, (g00.a) D, h11, 0);
        dk.a aVar2 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        yj.d e11 = aVar2.a(h11, i12).e();
        int i13 = yj.d.f76453b;
        float f12 = 8;
        DividerKt.a(null, e11.h(h11, i13), e2.h.l(f12), 0.0f, h11, 384, 9);
        int i14 = 8 | (i11 & 112);
        k(userEntity, onActionClicked, h11, i14);
        DividerKt.a(null, aVar2.a(h11, i12).e().h(h11, i13), e2.h.l(f12), 0.0f, h11, 384, 9);
        a(userEntity, onActionClicked, h11, i14);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$ProfileEditInitial$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i15) {
                    ProfileEditInitialKt.m(UserEntity.this, onActionClicked, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(final androidx.compose.ui.c cVar, final String str, final String str2, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        p pVar;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar.h(-1240630280);
        if ((i11 & 14) == 0) {
            if (h11.T(cVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.T(str2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        if ((i16 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1240630280, i16, -1, "com.forsale.app.features.more.user.editprofile.UserAvatar (ProfileEditInitial.kt:124)");
            }
            h11.C(128437576);
            if (str == null) {
                pVar = null;
            } else {
                AvatarsKt.a(cVar, h5.d.a(str, null, null, null, 0, h11, 0, 30), new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$UserAvatar$1$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                }, false, null, AvatarSize.SIZE_88, h11, (i16 & 14) | 196992, 24);
                pVar = p.f75480a;
            }
            h11.S();
            if (pVar == null) {
                AvatarsKt.c(null, str2, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$UserAvatar$2$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                }, false, null, AvatarSize.SIZE_88, h11, ((i16 >> 3) & 112) | 196992, 25);
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$UserAvatar$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i17) {
                    ProfileEditInitialKt.n(androidx.compose.ui.c.this, str, str2, aVar2, v0.a(i11 | 1));
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
    public static final void o(final String str, final String str2, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar2.h(1549700563);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(aVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1549700563, i12, -1, "com.forsale.app.features.more.user.editprofile.UserImage (ProfileEditInitial.kt:96)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar3, 0.0f, 1, null), 0.0f, e2.h.l(16), 0.0f, e2.h.l(12), 5, null);
            Arrangement.f b11 = Arrangement.f3698a.b();
            h11.C(693286680);
            b.a aVar4 = v0.b.f74009a;
            a0 a11 = androidx.compose.foundation.layout.o.a(b11, aVar4.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
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
            u uVar = u.f74924a;
            float f11 = 88;
            androidx.compose.ui.c u11 = SizeKt.u(SizeKt.i(aVar3, e2.h.l(f11)), e2.h.l(f11));
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
            h11.C(-1323940314);
            int a15 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a16 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(u11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a16);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a17 = Updater.a(h11);
            Updater.c(a17, g11, companion.e());
            Updater.c(a17, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.p(Integer.valueOf(a15), b13);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            int i16 = i12 << 3;
            n(aVar3, str, str2, h11, (i16 & 896) | (i16 & 112) | 6);
            p(aVar, h11, (i12 >> 6) & 14);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$UserImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i17) {
                    ProfileEditInitialKt.o(str, str2, aVar, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(-1511949367);
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
                androidx.compose.runtime.c.U(-1511949367, i12, -1, "com.forsale.app.features.more.user.editprofile.UserImageEdit (ProfileEditInitial.kt:142)");
            }
            float f11 = 88;
            androidx.compose.ui.c u11 = SizeKt.u(SizeKt.i(androidx.compose.ui.c.f7566a, e2.h.l(f11)), e2.h.l(f11));
            v0.b c11 = v0.b.f74009a.c();
            h11.C(733328855);
            a0 g11 = BoxKt.g(c11, false, h11, 6);
            h11.C(-1323940314);
            int a11 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(u11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a12);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a13 = Updater.a(h11);
            Updater.c(a13, g11, companion.e());
            Updater.c(a13, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            e(aVar, h11, i12 & 14);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.ProfileEditInitialKt$UserImageEdit$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i14) {
                    ProfileEditInitialKt.p(aVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
