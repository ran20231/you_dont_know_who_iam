package com.forsale.app.intializers;

import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticInitializer.kt */
@d(c = "com.forsale.app.intializers.AnalyticInitializer$registerVerticalNamesListeners$1", f = "AnalyticInitializer.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticInitializer$registerVerticalNamesListeners$1 extends SuspendLambda implements p<List<? extends Integer>, zz.a<? super List<? extends String>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37549a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37550b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AnalyticInitializer f37551c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticInitializer$registerVerticalNamesListeners$1(AnalyticInitializer analyticInitializer, zz.a<? super AnalyticInitializer$registerVerticalNamesListeners$1> aVar) {
        super(2, aVar);
        this.f37551c = analyticInitializer;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(List<Integer> list, zz.a<? super List<String>> aVar) {
        return ((AnalyticInitializer$registerVerticalNamesListeners$1) create(list, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        AnalyticInitializer$registerVerticalNamesListeners$1 analyticInitializer$registerVerticalNamesListeners$1 = new AnalyticInitializer$registerVerticalNamesListeners$1(this.f37551c, aVar);
        analyticInitializer$registerVerticalNamesListeners$1.f37550b = obj;
        return analyticInitializer$registerVerticalNamesListeners$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f37549a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CategoriesRepositories o11 = this.f37551c.o();
            this.f37549a = 1;
            obj = o11.getCategoriesNameEnByIds((List) this.f37550b, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }
}
