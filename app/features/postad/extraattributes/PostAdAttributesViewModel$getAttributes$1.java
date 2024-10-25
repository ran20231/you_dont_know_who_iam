package com.forsale.app.features.postad.extraattributes;

import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import g00.p;
import java.util.Comparator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$getAttributes$1", f = "PostAdAttributesViewModel.kt", l = {167, 168, 184}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$getAttributes$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35139a;

    /* renamed from: b  reason: collision with root package name */
    int f35140b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35141c;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((ExtraAttributeFlatGroupEntity) t11).getTypeDisplayOrder()), Integer.valueOf(((ExtraAttributeFlatGroupEntity) t12).getTypeDisplayOrder()));
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((ExtraAttributeFlatGroupEntity) t11).getTypeDisplayOrder()), Integer.valueOf(((ExtraAttributeFlatGroupEntity) t12).getTypeDisplayOrder()));
            return a11;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f35142a;

        public c(Comparator comparator) {
            this.f35142a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            int compare = this.f35142a.compare(t11, t12);
            if (compare == 0) {
                a11 = yz.b.a(Integer.valueOf(((ExtraAttributeFlatGroupEntity) t11).getDisplayOrder()), Integer.valueOf(((ExtraAttributeFlatGroupEntity) t12).getDisplayOrder()));
                return a11;
            }
            return compare;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f35143a;

        public d(Comparator comparator) {
            this.f35143a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            int compare = this.f35143a.compare(t11, t12);
            if (compare == 0) {
                a11 = yz.b.a(Integer.valueOf(((ExtraAttributeFlatGroupEntity) t11).getDisplayOrder()), Integer.valueOf(((ExtraAttributeFlatGroupEntity) t12).getDisplayOrder()));
                return a11;
            }
            return compare;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$getAttributes$1(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$getAttributes$1> aVar) {
        super(2, aVar);
        this.f35141c = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$getAttributes$1(this.f35141c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$getAttributes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$getAttributes$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
