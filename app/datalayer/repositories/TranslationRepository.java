package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import up.c;
import wz.h;
/* compiled from: TranslationRepository.kt */
/* loaded from: classes2.dex */
public final class TranslationRepository {
    private static final String TRANSLATION = "translation";

    /* renamed from: cs  reason: collision with root package name */
    private final CoroutineScope f22373cs;
    private final c0<Translation> observer;
    private final jj.b prefUtils;
    private final LiveData<Translation> translation;
    private final h translationLiveData$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TranslationRepository.kt */
    @d(c = "com.forsale.app.datalayer.repositories.TranslationRepository$1", f = "TranslationRepository.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.datalayer.repositories.TranslationRepository$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TranslationRepository.kt */
        @d(c = "com.forsale.app.datalayer.repositories.TranslationRepository$1$1", f = "TranslationRepository.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.datalayer.repositories.TranslationRepository$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02511 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
            int label;
            final /* synthetic */ TranslationRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02511(TranslationRepository translationRepository, zz.a<? super C02511> aVar) {
                super(2, aVar);
                this.this$0 = translationRepository;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C02511(this.this$0, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.label == 0) {
                    f.b(obj);
                    this.this$0.translation.observeForever(this.this$0.getObserver());
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                return ((C02511) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                C02511 c02511 = new C02511(TranslationRepository.this, null);
                this.label = 1;
                if (CoroutinesExtensionsKt.a((CoroutineScope) this.L$0, c02511, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: TranslationRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TranslationRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Translation {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ Translation[] $VALUES;
        private final int key;
        private final String value;
        @c("original")
        public static final Translation ORIGINAL = new Translation("ORIGINAL", 0, 0, "");
        @c(SearchPlaceholderKeywordEntity.EN)
        public static final Translation ENGLISH = new Translation("ENGLISH", 1, 1, SearchPlaceholderKeywordEntity.EN);
        @c(SearchPlaceholderKeywordEntity.AR)
        public static final Translation ARABIC = new Translation("ARABIC", 2, 2, SearchPlaceholderKeywordEntity.AR);

        private static final /* synthetic */ Translation[] $values() {
            return new Translation[]{ORIGINAL, ENGLISH, ARABIC};
        }

        static {
            Translation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Translation(String str, int i11, int i12, String str2) {
            this.key = i12;
            this.value = str2;
        }

        public static a00.a<Translation> getEntries() {
            return $ENTRIES;
        }

        public static Translation valueOf(String str) {
            return (Translation) Enum.valueOf(Translation.class, str);
        }

        public static Translation[] values() {
            return (Translation[]) $VALUES.clone();
        }

        public final int getKey() {
            return this.key;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public TranslationRepository(jj.b prefUtils, CoroutineScope cs2) {
        h a11;
        o.i(prefUtils, "prefUtils");
        o.i(cs2, "cs");
        this.prefUtils = prefUtils;
        this.f22373cs = cs2;
        this.translation = FlowLiveDataConversions.c(FlowKt.distinctUntilChanged(prefUtils.g().d()), null, 0L, 3, null);
        a11 = kotlin.d.a(new g00.a<b0<Translation>>() { // from class: com.forsale.app.datalayer.repositories.TranslationRepository$translationLiveData$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<TranslationRepository.Translation> invoke() {
                return new b0<>();
            }
        });
        this.translationLiveData$delegate = a11;
        this.observer = new c0<Translation>() { // from class: com.forsale.app.datalayer.repositories.TranslationRepository$observer$1
            @Override // androidx.lifecycle.c0
            public final void onChanged(TranslationRepository.Translation it2) {
                CoroutineScope coroutineScope;
                o.i(it2, "it");
                coroutineScope = TranslationRepository.this.f22373cs;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new TranslationRepository$observer$1$onChanged$1(TranslationRepository.this, null), 3, null);
            }
        };
        BuildersKt__Builders_commonKt.launch$default(cs2, null, null, new AnonymousClass1(null), 3, null);
    }

    private final b0<Translation> getTranslationLiveData() {
        return (b0) this.translationLiveData$delegate.getValue();
    }

    private final Translation mapToTranslation(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return Translation.ARABIC;
                }
                String simpleName = Translation.class.getSimpleName();
                throw new IllegalArgumentException(i11 + " value does not have any corresponding value in " + simpleName + " Enum");
            }
            return Translation.ENGLISH;
        }
        return Translation.ORIGINAL;
    }

    public final void clear() {
        this.translation.removeObserver(this.observer);
    }

    public final Object getCurrentTranslation(zz.a<? super Translation> aVar) {
        return this.prefUtils.g().c(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCurrentTranslationAndNotifyChange(zz.a<? super com.forsale.app.datalayer.repositories.TranslationRepository.Translation> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.TranslationRepository$getCurrentTranslationAndNotifyChange$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.TranslationRepository$getCurrentTranslationAndNotifyChange$1 r0 = (com.forsale.app.datalayer.repositories.TranslationRepository$getCurrentTranslationAndNotifyChange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.TranslationRepository$getCurrentTranslationAndNotifyChange$1 r0 = new com.forsale.app.datalayer.repositories.TranslationRepository$getCurrentTranslationAndNotifyChange$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.TranslationRepository r0 = (com.forsale.app.datalayer.repositories.TranslationRepository) r0
            kotlin.f.b(r5)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.getCurrentTranslation(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            androidx.lifecycle.b0 r0 = r0.getTranslationLiveData()
            r1 = r5
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r1 = (com.forsale.app.datalayer.repositories.TranslationRepository.Translation) r1
            r0.postValue(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.TranslationRepository.getCurrentTranslationAndNotifyChange(zz.a):java.lang.Object");
    }

    public final c0<Translation> getObserver() {
        return this.observer;
    }

    public final Object setCurrentTranslation(Translation translation, zz.a<? super wz.p> aVar) {
        Object f11;
        Object g11 = this.prefUtils.g().g(translation.getKey(), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (g11 == f11) {
            return g11;
        }
        return wz.p.f75480a;
    }

    /* renamed from: getTranslationLiveData  reason: collision with other method in class */
    public final LiveData<Translation> m8getTranslationLiveData() {
        return this.translation;
    }
}
