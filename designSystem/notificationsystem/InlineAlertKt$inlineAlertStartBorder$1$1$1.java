package com.forsale.designSystem.notificationsystem;

import a1.g;
import androidx.compose.ui.unit.LayoutDirection;
import b1.u4;
import com.leanplum.internal.ResourceQualifiers;
import d1.f;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: InlineAlert.kt */
/* loaded from: classes3.dex */
final class InlineAlertKt$inlineAlertStartBorder$1$1$1 extends Lambda implements l<f, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutDirection f41950a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f41951b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f41952c;

    /* compiled from: InlineAlert.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41953a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41953a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineAlertKt$inlineAlertStartBorder$1$1$1(LayoutDirection layoutDirection, long j11, float f11) {
        super(1);
        this.f41950a = layoutDirection;
        this.f41951b = j11;
        this.f41952c = f11;
    }

    public final void b(f drawBehind) {
        o.i(drawBehind, "$this$drawBehind");
        int i11 = a.f41953a[this.f41950a.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                f.V(drawBehind, this.f41951b, g.a(0.0f, 0.0f), g.a(0.0f, a1.l.g(drawBehind.b())), this.f41952c, u4.f15999a.c(), null, 0.0f, null, 0, ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_XXHIGH, null);
                return;
            }
            return;
        }
        f.V(drawBehind, this.f41951b, g.a(a1.l.i(drawBehind.b()), 0.0f), g.a(a1.l.i(drawBehind.b()), a1.l.g(drawBehind.b())), this.f41952c, u4.f15999a.c(), null, 0.0f, null, 0, ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_XXHIGH, null);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(f fVar) {
        b(fVar);
        return p.f75480a;
    }
}
