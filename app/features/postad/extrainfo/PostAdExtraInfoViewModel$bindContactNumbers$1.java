package com.forsale.app.features.postad.extrainfo;

import g00.p;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$bindContactNumbers$1", f = "PostAdExtraInfoViewModel.kt", l = {318}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$bindContactNumbers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35508a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35509b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f35510c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$bindContactNumbers$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, boolean z11, zz.a<? super PostAdExtraInfoViewModel$bindContactNumbers$1> aVar) {
        super(2, aVar);
        this.f35509b = postAdExtraInfoViewModel;
        this.f35510c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$bindContactNumbers$1(this.f35509b, this.f35510c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Set set;
        boolean z11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35508a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            this.f35509b.U1();
            this.f35509b.W1();
            set = this.f35509b.O0;
            if (set != null) {
                this.f35509b.H1(this.f35510c);
                return wz.p.f75480a;
            }
            PostAdExtraInfoViewModel postAdExtraInfoViewModel = this.f35509b;
            this.f35508a = 1;
            obj = postAdExtraInfoViewModel.c1(this);
            if (obj == f11) {
                return f11;
            }
        }
        Set set2 = (Set) obj;
        if (set2 != null && !set2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        wz.p pVar = null;
        if (!(!z11)) {
            obj = null;
        }
        Set set3 = (Set) obj;
        if (set3 != null) {
            this.f35509b.G1(set3);
            pVar = wz.p.f75480a;
        }
        if (pVar == null) {
            this.f35509b.V1(false);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$bindContactNumbers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
