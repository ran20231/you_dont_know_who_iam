package com.forsale.app.features.postad.location;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$onDoneClicked$1", f = "PostAdLocationViewModel.kt", l = {207, 210}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$onDoneClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35739a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$BooleanRef f35740b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35741c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$onDoneClicked$1(Ref$BooleanRef ref$BooleanRef, PostAdLocationViewModel postAdLocationViewModel, zz.a<? super PostAdLocationViewModel$onDoneClicked$1> aVar) {
        super(2, aVar);
        this.f35740b = ref$BooleanRef;
        this.f35741c = postAdLocationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$onDoneClicked$1(this.f35740b, this.f35741c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f35739a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f35740b.f61774a) {
                this.f35741c.D2();
                mutableSharedFlow = this.f35741c.f35688q0;
                wz.p pVar = wz.p.f75480a;
                this.f35739a = 2;
                if (mutableSharedFlow.emit(pVar, this) == f11) {
                    return f11;
                }
            } else {
                MutableSharedFlow<String> j02 = this.f35741c.j0();
                String string = this.f35741c.J().getString(y0.F4, new Object[0]);
                this.f35739a = 1;
                if (j02.emit(string, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$onDoneClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
