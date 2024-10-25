package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.datalayer.network.entities.BusinessType;
import g00.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$setMaxNumbersAllowed$1", f = "PostAdExtraInfoViewModel.kt", l = {411}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$setMaxNumbersAllowed$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35547a;

    /* renamed from: b  reason: collision with root package name */
    int f35548b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35549c;

    /* compiled from: PostAdExtraInfoViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35550a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.BUSINESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BusinessType.PERSONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35550a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$setMaxNumbersAllowed$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$setMaxNumbersAllowed$1> aVar) {
        super(2, aVar);
        this.f35549c = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$setMaxNumbersAllowed$1(this.f35549c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        we.a aVar;
        PostAdExtraInfoViewModel postAdExtraInfoViewModel;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35548b;
        if (i11 != 0) {
            if (i11 == 1) {
                postAdExtraInfoViewModel = (PostAdExtraInfoViewModel) this.f35547a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PostAdExtraInfoViewModel postAdExtraInfoViewModel2 = this.f35549c;
            aVar = postAdExtraInfoViewModel2.f35486n0;
            this.f35547a = postAdExtraInfoViewModel2;
            this.f35548b = 1;
            Object a11 = aVar.a(this);
            if (a11 == f11) {
                return f11;
            }
            postAdExtraInfoViewModel = postAdExtraInfoViewModel2;
            obj = a11;
        }
        int i12 = a.f35550a[((BusinessType) obj).ordinal()];
        if (i12 != 1 && i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        postAdExtraInfoViewModel.X1(2);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$setMaxNumbersAllowed$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
