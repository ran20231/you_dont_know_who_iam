package com.forsale.app.features.postad;

import com.forsale.app.datalayer.network.responses.Bundle;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.PLFCloseTarget;
import com.forsale.app.utils.analytics.PLFScreenTypes;
import com.forsale.app.utils.analytics.PLFSource;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$logAnalytics$1", f = "PostAdViewModel.kt", l = {821, 817, 826}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f34060a;

    /* renamed from: b  reason: collision with root package name */
    Object f34061b;

    /* renamed from: c  reason: collision with root package name */
    Object f34062c;

    /* renamed from: d  reason: collision with root package name */
    Object f34063d;

    /* renamed from: e  reason: collision with root package name */
    Object f34064e;

    /* renamed from: f  reason: collision with root package name */
    int f34065f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34066g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ CreateEditAdvActionType f34067h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ PLFSource f34068i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ PLFScreenTypes f34069j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ PLFCloseTarget f34070x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ Bundle f34071y;

    /* compiled from: PostAdViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34072a;

        static {
            int[] iArr = new int[CreateEditAdvActionType.values().length];
            try {
                iArr[CreateEditAdvActionType.ADD_LISTING_VISITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateEditAdvActionType.EDIT_LISTING_VISITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateEditAdvActionType.ADD_SETTINGS_NEXT_CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CreateEditAdvActionType.EDIT_SETTINGS_NEXT_CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CreateEditAdvActionType.ADD_ADDON_CONFIRM_PAYMENT_CLICKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CreateEditAdvActionType.EDIT_ADDON_CONFIRM_PAYMENT_CLICKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CreateEditAdvActionType.ADD_BUNDLE_CHECKOUT_CLICKED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CreateEditAdvActionType.EDIT_BUNDLE_CHECKOUT_CLICKED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CreateEditAdvActionType.ADD_BUNDLE_CHOOSE_ADDON_CLICKED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CreateEditAdvActionType.EDIT_BUNDLE_CHOOSE_ADDON_CLICKED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CreateEditAdvActionType.BUNDLES_TO_OLD_EXPERIENCE_CLICKED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f34072a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$logAnalytics$1(PostAdViewModel postAdViewModel, CreateEditAdvActionType createEditAdvActionType, PLFSource pLFSource, PLFScreenTypes pLFScreenTypes, PLFCloseTarget pLFCloseTarget, Bundle bundle, zz.a<? super PostAdViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f34066g = postAdViewModel;
        this.f34067h = createEditAdvActionType;
        this.f34068i = pLFSource;
        this.f34069j = pLFScreenTypes;
        this.f34070x = pLFCloseTarget;
        this.f34071y = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$logAnalytics$1(this.f34066g, this.f34067h, this.f34068i, this.f34069j, this.f34070x, this.f34071y, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0134  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.PostAdViewModel$logAnalytics$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
