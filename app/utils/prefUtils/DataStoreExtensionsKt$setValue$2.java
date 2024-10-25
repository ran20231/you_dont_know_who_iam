package com.forsale.app.utils.prefUtils;

import androidx.datastore.preferences.core.MutablePreferences;
import g00.p;
import h3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataStoreExtensions.kt */
@d(c = "com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$setValue$2", f = "DataStoreExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreExtensionsKt$setValue$2 extends SuspendLambda implements p<MutablePreferences, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40433a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40434b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a.C0641a<T> f40435c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ T f40436d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreExtensionsKt$setValue$2(a.C0641a<T> c0641a, T t11, zz.a<? super DataStoreExtensionsKt$setValue$2> aVar) {
        super(2, aVar);
        this.f40435c = c0641a;
        this.f40436d = t11;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(MutablePreferences mutablePreferences, zz.a<? super wz.p> aVar) {
        return ((DataStoreExtensionsKt$setValue$2) create(mutablePreferences, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        DataStoreExtensionsKt$setValue$2 dataStoreExtensionsKt$setValue$2 = new DataStoreExtensionsKt$setValue$2(this.f40435c, this.f40436d, aVar);
        dataStoreExtensionsKt$setValue$2.f40434b = obj;
        return dataStoreExtensionsKt$setValue$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f40433a == 0) {
            f.b(obj);
            ((MutablePreferences) this.f40434b).i(this.f40435c, this.f40436d);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
