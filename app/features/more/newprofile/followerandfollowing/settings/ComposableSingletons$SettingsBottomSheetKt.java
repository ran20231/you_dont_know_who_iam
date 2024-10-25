package com.forsale.app.features.more.newprofile.followerandfollowing.settings;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.p;
import g00.q;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import t9.y0;
import w.t;
import yj.d;
/* compiled from: SettingsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SettingsBottomSheetKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$SettingsBottomSheetKt f32308a = new ComposableSingletons$SettingsBottomSheetKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<a, Integer, wz.p> f32309b = b.c(286020608, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.ComposableSingletons$SettingsBottomSheetKt$lambda-1$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(286020608, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.ComposableSingletons$SettingsBottomSheetKt.lambda-1.<anonymous> (SettingsBottomSheet.kt:90)");
            }
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static q<t, a, Integer, wz.p> f32310c = b.c(-1305516220, false, new q<t, a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.ComposableSingletons$SettingsBottomSheetKt$lambda-2$1
        public final void b(t ListItem, a aVar, int i11) {
            o.i(ListItem, "$this$ListItem");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-1305516220, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.ComposableSingletons$SettingsBottomSheetKt.lambda-2.<anonymous> (SettingsBottomSheet.kt:106)");
            }
            String b11 = g.b(y0.Re, aVar, 0);
            dk.a aVar2 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            TextKt.a(b11, null, 0, 0, false, 0, 0, null, aVar2.c(aVar, i12).a(), aVar2.a(aVar, i12).e().m(aVar, d.f76453b), 0, aVar, 0, 0, 1278);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ wz.p invoke(t tVar, a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    public final p<a, Integer, wz.p> a() {
        return f32309b;
    }

    public final q<t, a, Integer, wz.p> b() {
        return f32310c;
    }
}
