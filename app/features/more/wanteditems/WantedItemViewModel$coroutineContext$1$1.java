package com.forsale.app.features.more.wanteditems;

import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: WantedItemViewModel.kt */
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemViewModel$coroutineContext$1$1", f = "WantedItemViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WantedItemViewModel$coroutineContext$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33736a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WantedItemViewModel f33737b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f33738c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemViewModel$coroutineContext$1$1(WantedItemViewModel wantedItemViewModel, Throwable th2, zz.a<? super WantedItemViewModel$coroutineContext$1$1> aVar) {
        super(2, aVar);
        this.f33737b = wantedItemViewModel;
        this.f33738c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new WantedItemViewModel$coroutineContext$1$1(this.f33737b, this.f33738c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f33736a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<String> i02 = this.f33737b.i0();
            String g02 = TypeExtensionsKt.g0(this.f33738c);
            this.f33736a = 1;
            if (i02.emit(g02, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((WantedItemViewModel$coroutineContext$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
