package com.forsale.designSystem.inputs;

import b0.b;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import wz.p;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$EditText$1 extends Lambda implements l<z0.l, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f41405a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f41406b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Inputs.kt */
    @d(c = "com.forsale.designSystem.inputs.InputsKt$EditText$1$1", f = "Inputs.kt", l = {898, 899}, m = "invokeSuspend")
    /* renamed from: com.forsale.designSystem.inputs.InputsKt$EditText$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f41407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f41408b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(b bVar, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f41408b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f41408b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f41407a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        return p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                this.f41407a = 1;
                if (DelayKt.delay(250L, this) == f11) {
                    return f11;
                }
            }
            b bVar = this.f41408b;
            this.f41407a = 2;
            if (b.b(bVar, null, this, 1, null) == f11) {
                return f11;
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputsKt$EditText$1(CoroutineScope coroutineScope, b bVar) {
        super(1);
        this.f41405a = coroutineScope;
        this.f41406b = bVar;
    }

    public final void b(z0.l it2) {
        o.i(it2, "it");
        if (it2.isFocused() || it2.getHasFocus()) {
            BuildersKt__Builders_commonKt.launch$default(this.f41405a, null, null, new AnonymousClass1(this.f41406b, null), 3, null);
        }
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(z0.l lVar) {
        b(lVar);
        return p.f75480a;
    }
}
