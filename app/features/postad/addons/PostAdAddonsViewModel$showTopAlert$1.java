package com.forsale.app.features.postad.addons;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsViewModel$showTopAlert$1", f = "PostAdAddonsViewModel.kt", l = {354}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsViewModel$showTopAlert$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34388a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsViewModel f34389b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f34390c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsViewModel$showTopAlert$1(PostAdAddonsViewModel postAdAddonsViewModel, String str, zz.a<? super PostAdAddonsViewModel$showTopAlert$1> aVar) {
        super(2, aVar);
        this.f34389b = postAdAddonsViewModel;
        this.f34390c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsViewModel$showTopAlert$1(this.f34389b, this.f34390c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34388a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<String> j02 = this.f34389b.j0();
            String str = this.f34390c;
            this.f34388a = 1;
            if (j02.emit(str, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsViewModel$showTopAlert$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
