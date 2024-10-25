package com.forsale.app.utils.prefUtils;

import g00.q;
import h3.a;
import java.io.IOException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataStoreExtensions.kt */
@d(c = "com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValueAsFlow$1", f = "DataStoreExtensions.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreExtensionsKt$getValueAsFlow$1 extends SuspendLambda implements q<FlowCollector<? super a>, Throwable, zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40427a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40428b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40429c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataStoreExtensionsKt$getValueAsFlow$1(zz.a<? super DataStoreExtensionsKt$getValueAsFlow$1> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(FlowCollector<? super a> flowCollector, Throwable th2, zz.a<? super p> aVar) {
        DataStoreExtensionsKt$getValueAsFlow$1 dataStoreExtensionsKt$getValueAsFlow$1 = new DataStoreExtensionsKt$getValueAsFlow$1(aVar);
        dataStoreExtensionsKt$getValueAsFlow$1.f40428b = flowCollector;
        dataStoreExtensionsKt$getValueAsFlow$1.f40429c = th2;
        return dataStoreExtensionsKt$getValueAsFlow$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f40427a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f40428b;
            Throwable th2 = (Throwable) this.f40429c;
            if (th2 instanceof IOException) {
                a a11 = h3.b.a();
                this.f40428b = null;
                this.f40427a = 1;
                if (flowCollector.emit(a11, this) == f11) {
                    return f11;
                }
            } else {
                throw th2;
            }
        }
        return p.f75480a;
    }
}
