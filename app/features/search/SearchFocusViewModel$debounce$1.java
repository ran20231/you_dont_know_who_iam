package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import q00.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$debounce$1", f = "SearchFocusViewModel.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$debounce$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36736a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<Job> f36737b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f36738c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g00.l<String, wz.p> f36739d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f36740e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchFocusViewModel$debounce$1(Ref$ObjectRef<Job> ref$ObjectRef, long j11, g00.l<? super String, wz.p> lVar, String str, zz.a<? super SearchFocusViewModel$debounce$1> aVar) {
        super(2, aVar);
        this.f36737b = ref$ObjectRef;
        this.f36738c = j11;
        this.f36739d = lVar;
        this.f36740e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$debounce$1(this.f36737b, this.f36738c, this.f36739d, this.f36740e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36736a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Job job = this.f36737b.f61778a;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            a.C0787a c0787a = q00.a.f66227b;
            long i12 = q00.c.i(this.f36738c, DurationUnit.MILLISECONDS);
            this.f36736a = 1;
            if (DelayKt.m16delayVtjQ1oo(i12, this) == f11) {
                return f11;
            }
        }
        this.f36739d.invoke(this.f36740e);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$debounce$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
