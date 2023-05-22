module.exports = api => {
  const babelEnv = api.env();
  const plugins = [];
  if (babelEnv !== 'development') {
    plugins.push(['transform-remove-console']);
    plugins.push(['@babel/plugin-transform-react-display-name']);
  }
  return {
    presets: ['module:metro-react-native-babel-preset'],
    plugins,
  };
};
