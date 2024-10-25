package com.forsale.designSystem.bottomsheets;

import a1.f;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.f0;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Lambda;
import zz.a;
/* compiled from: BottomSheets.kt */
@d(c = "com.forsale.designSystem.bottomsheets.BottomSheetsKt$Scrim$dismissModifier$1$1", f = "BottomSheets.kt", l = {360}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BottomSheetsKt$Scrim$dismissModifier$1$1 extends SuspendLambda implements p<f0, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40852a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40853b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f40854c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BottomSheets.kt */
    /* renamed from: com.forsale.designSystem.bottomsheets.BottomSheetsKt$Scrim$dismissModifier$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements l<f, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f40855a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(g00.a<wz.p> aVar) {
            super(1);
            this.f40855a = aVar;
        }

        public final void b(long j11) {
            this.f40855a.invoke();
        }

        @Override // g00.l
        public /* bridge */ /* synthetic */ wz.p invoke(f fVar) {
            b(fVar.x());
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetsKt$Scrim$dismissModifier$1$1(g00.a<wz.p> aVar, a<? super BottomSheetsKt$Scrim$dismissModifier$1$1> aVar2) {
        super(2, aVar2);
        this.f40854c = aVar;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(f0 f0Var, a<? super wz.p> aVar) {
        return ((BottomSheetsKt$Scrim$dismissModifier$1$1) create(f0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        BottomSheetsKt$Scrim$dismissModifier$1$1 bottomSheetsKt$Scrim$dismissModifier$1$1 = new BottomSheetsKt$Scrim$dismissModifier$1$1(this.f40854c, aVar);
        bottomSheetsKt$Scrim$dismissModifier$1$1.f40853b = obj;
        return bottomSheetsKt$Scrim$dismissModifier$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f40852a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            f0 f0Var = (f0) this.f40853b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f40854c);
            this.f40852a = 1;
            if (TapGestureDetectorKt.j(f0Var, null, null, null, anonymousClass1, this, 7, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}
