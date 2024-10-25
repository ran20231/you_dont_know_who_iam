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
@d(c = "com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$2", f = "DataStoreExtensions.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreExtensionsKt$getValue$2 extends SuspendLambda implements q<FlowCollector<? super a>, Throwable, zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40424a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40425b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40426c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataStoreExtensionsKt$getValue$2(zz.a<? super DataStoreExtensionsKt$getValue$2> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(FlowCollector<? super a> flowCollector, Throwable th2, zz.a<? super p> aVar) {
        DataStoreExtensionsKt$getValue$2 dataStoreExtensionsKt$getValue$2 = new DataStoreExtensionsKt$getValue$2(aVar);
        dataStoreExtensionsKt$getValue$2.f40425b = flowCollector;
        dataStoreExtensionsKt$getValue$2.f40426c = th2;
        return dataStoreExtensionsKt$getValue$2.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f40424a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f40425b;
            Throwable th2 = (Throwable) this.f40426c;
            if (th2 instanceof IOException) {
                a a11 = h3.b.a();
                this.f40425b = null;
                this.f40424a = 1;
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
