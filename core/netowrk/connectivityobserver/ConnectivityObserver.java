package com.forsale.core.netowrk.connectivityobserver;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConnectivityObserver.kt */
/* loaded from: classes3.dex */
public interface ConnectivityObserver {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConnectivityObserver.kt */
    /* loaded from: classes3.dex */
    public static final class NetworkStatus {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ NetworkStatus[] $VALUES;
        public static final NetworkStatus Connected = new Connected("Connected", 0);
        public static final NetworkStatus Lost = new Lost("Lost", 1);
        public static final NetworkStatus Idle = new Idle("Idle", 2);

        /* compiled from: ConnectivityObserver.kt */
        /* loaded from: classes3.dex */
        static final class Connected extends NetworkStatus {
            Connected(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Connected";
            }
        }

        /* compiled from: ConnectivityObserver.kt */
        /* loaded from: classes3.dex */
        static final class Idle extends NetworkStatus {
            Idle(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Idle";
            }
        }

        /* compiled from: ConnectivityObserver.kt */
        /* loaded from: classes3.dex */
        static final class Lost extends NetworkStatus {
            Lost(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Lost";
            }
        }

        private static final /* synthetic */ NetworkStatus[] $values() {
            return new NetworkStatus[]{Connected, Lost, Idle};
        }

        static {
            NetworkStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        public /* synthetic */ NetworkStatus(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11);
        }

        public static a00.a<NetworkStatus> getEntries() {
            return $ENTRIES;
        }

        public static NetworkStatus valueOf(String str) {
            return (NetworkStatus) Enum.valueOf(NetworkStatus.class, str);
        }

        public static NetworkStatus[] values() {
            return (NetworkStatus[]) $VALUES.clone();
        }

        private NetworkStatus(String str, int i11) {
        }
    }

    NetworkStatus a();
}
