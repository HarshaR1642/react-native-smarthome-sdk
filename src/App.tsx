import { GestureHandlerRootView } from 'react-native-gesture-handler';
import type { ReactNode } from 'react';
import { SafeAreaView, StyleSheet, View } from 'react-native';
import { SmartHomeSDK } from 'smarthome-sdk';

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  mainView: {
    flex: 1,
    backgroundColor: '#F3FAFF',
  },
});

const getPropertyLevelTokenApi = async ({
  propertyId,
  clientId,
  clientSecret,
}: any) => {
  const url = `https://smarthome.qe.rentlycore.com/api/properties/${propertyId}/token`;

  const params = {
    client_id: clientId,
    client_secret: clientSecret,
  };

  try {
    const response = await fetch(url, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(params),
    });

    if (!response.ok) {
      throw new Error();
    }

    const accessTokenData = await response.json();
    return Promise.resolve(accessTokenData);
  } catch (error: any) {
    if (error) {
      console.log('Error in fetching property token', error);
      return Promise.reject(error);
    }
  }
};

const App: () => ReactNode = () => {
  const clientId = 'ekhp0b6oJqoh_-h-Z2LC6iYktRKaNP-Zw01EnQLBrms';
  const clientSecret = '12oJR9VJ82HKDPJ9fG5IsvPz3hmVl8jog6yOes6Lwsc';
  const propertyId = 227997;

  const getAccessToken = async () => {
    return await getPropertyLevelTokenApi({
      clientId,
      clientSecret,
      propertyId,
    });
  };

  return (
    <SafeAreaView style={styles.container}>
      <GestureHandlerRootView style={styles.container}>
        <View style={styles.mainView}>
          <SmartHomeSDK
            getAccessToken={getAccessToken}
            propertyId={propertyId}
          />
        </View>
      </GestureHandlerRootView>
    </SafeAreaView>
  );
};

export default App;
