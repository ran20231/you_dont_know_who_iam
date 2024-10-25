package com.forsale.app.features.more.newprofile.followerandfollowing.itemui;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import t9.y0;
import w.t;
import wz.p;
/* compiled from: FollowerAndFollowingItemUi.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$FollowerAndFollowingItemUiKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$FollowerAndFollowingItemUiKt f32267a = new ComposableSingletons$FollowerAndFollowingItemUiKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<t, a, Integer, p> f32268b = b.c(534770727, false, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.ComposableSingletons$FollowerAndFollowingItemUiKt$lambda-1$1
        public final void b(t FilledButton, a aVar, int i11) {
            o.i(FilledButton, "$this$FilledButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(534770727, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.ComposableSingletons$FollowerAndFollowingItemUiKt.lambda-1.<anonymous> (FollowerAndFollowingItemUi.kt:98)");
            }
            TextKt.a(g.b(y0.f70747x3, aVar, 0), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static q<t, a, Integer, p> f32269c = b.c(861350740, false, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.itemui.ComposableSingletons$FollowerAndFollowingItemUiKt$lambda-2$1
        public final void b(t OutLineButton, a aVar, int i11) {
            o.i(OutLineButton, "$this$OutLineButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(861350740, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.itemui.ComposableSingletons$FollowerAndFollowingItemUiKt.lambda-2.<anonymous> (FollowerAndFollowingItemUi.kt:116)");
            }
            TextKt.a(g.b(y0.f70779z3, aVar, 0), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return p.f75480a;
        }
    });

    public final q<t, a, Integer, p> a() {
        return f32268b;
    }

    public final q<t, a, Integer, p> b() {
        return f32269c;
    }
}
